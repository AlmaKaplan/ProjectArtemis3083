
package com.MAutils.Swerve.Utils;

import static edu.wpi.first.units.Units.Seconds;

import com.ctre.phoenix6.StatusCode;
import com.ctre.phoenix6.hardware.CANcoder;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.sim.CANcoderSimState;
import com.ctre.phoenix6.sim.ChassisReference;
import com.ctre.phoenix6.sim.TalonFXSimState;
import edu.wpi.first.units.measure.Angle;
import edu.wpi.first.units.measure.AngularVelocity;
import edu.wpi.first.units.measure.Voltage;
import edu.wpi.first.wpilibj.Timer;
import java.util.function.Supplier;
import org.ironmaple.simulation.SimulatedArena;
import org.ironmaple.simulation.motorsims.SimulatedMotorController;

public final class PhoenixUtil {
    /** Attempts to run the command until no error is produced. */
    public static void tryUntilOk(int maxAttempts, Supplier<StatusCode> command) {
        for (int i = 0; i < maxAttempts; i++) {
            var error = command.get();
            if (error.isOK()) break;
        }
    }

    public static class TalonFXMotorControllerSim implements SimulatedMotorController {
        private static int instances = 0;
        public final int id;

        private final TalonFXSimState talonFXSimState;

        public TalonFXMotorControllerSim(TalonFX talonFX, boolean motorInverted) {
            this.id = instances++;

            this.talonFXSimState = talonFX.getSimState();
            talonFXSimState.Orientation =
                    motorInverted ? ChassisReference.Clockwise_Positive : ChassisReference.CounterClockwise_Positive;
        }

        @Override
        public Voltage updateControlSignal(
                Angle mechanismAngle,
                AngularVelocity mechanismVelocity,
                Angle encoderAngle,
                AngularVelocity encoderVelocity) {
            talonFXSimState.setRawRotorPosition(encoderAngle);
            talonFXSimState.setRotorVelocity(encoderVelocity);
            talonFXSimState.setSupplyVoltage(12.0);
            return talonFXSimState.getMotorVoltageMeasure();
        }
    }

    public static class TalonFXMotorControllerWithRemoteCancoderSim extends TalonFXMotorControllerSim {
        private final CANcoderSimState remoteCancoderSimState;
        private final Angle encoderOffset;

        public TalonFXMotorControllerWithRemoteCancoderSim(
                TalonFX talonFX,
                boolean motorInverted,
                CANcoder cancoder,
                boolean encoderInverted,
                Angle encoderOffset) {
            super(talonFX, motorInverted);
            this.remoteCancoderSimState = cancoder.getSimState();
            this.remoteCancoderSimState.Orientation =
                    encoderInverted ? ChassisReference.Clockwise_Positive : ChassisReference.CounterClockwise_Positive;
            this.encoderOffset = encoderOffset;
        }

        @Override
        public Voltage updateControlSignal(
                Angle mechanismAngle,
                AngularVelocity mechanismVelocity,
                Angle encoderAngle,
                AngularVelocity encoderVelocity) {
            remoteCancoderSimState.setRawPosition(mechanismAngle.minus(encoderOffset));
            remoteCancoderSimState.setVelocity(mechanismVelocity);

            final Voltage output =
                    super.updateControlSignal(mechanismAngle, mechanismVelocity, encoderAngle, encoderVelocity);

            return output;
        }
    }

    public static double[] getSimulationOdometryTimeStamps() {
        final double[] odometryTimeStamps = new double[SimulatedArena.getSimulationSubTicksIn1Period()];
        for (int i = 0; i < odometryTimeStamps.length; i++) {
            odometryTimeStamps[i] = Timer.getFPGATimestamp()
                    - 0.02
                    + i * SimulatedArena.getSimulationDt().in(Seconds);
        }

        return odometryTimeStamps;
    }
}