
package frc.robot.subsystems.IntakeRollers;

import com.MAutils.Subsystems.DeafultSubsystems.Systems.PowerControlledSystem;

import edu.wpi.first.wpilibj.DigitalInput;
import frc.robot.PortMap;

public class IntakeRoller extends PowerControlledSystem {
    private static IntakeRoller intakeRoller;
    private DigitalInput intakeIR;

    private IntakeRoller() {
        super("IntakeRoller", IntakeRollerConstants.systemConstants,
                IntakeRollerConstants.INTAKE,
                IntakeRollerConstants.IDLE);
    
        intakeIR = new DigitalInput(PortMap.IntakeConatants.INTAKE_IR_SENSOR); 
    }

    public boolean isGamePieceInIntake() {
        return intakeIR.get(); 
    }

    public static IntakeRoller getInstants() {
        if (intakeRoller == null) {
            intakeRoller = new IntakeRoller();
        }
        return intakeRoller;
    }
}
