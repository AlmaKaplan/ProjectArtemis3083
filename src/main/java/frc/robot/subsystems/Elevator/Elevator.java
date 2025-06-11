
package frc.robot.subsystems.Elevator;

import com.MAutils.Subsystems.DeafultSubsystems.Systems.PositionControlledSystem;


public class Elevator extends PositionControlledSystem {
    private static Elevator elevator;

    public Elevator() {
        super("Elevator", ElevatorConstants.systemConstants,
                ElevatorConstants.BALL,
                ElevatorConstants.IDLE,
                ElevatorConstants.INTAKE,
                ElevatorConstants.SCORING);
    }

    public static Elevator getInstants() {
        if (elevator == null) {
            elevator = new Elevator();
        }

        return elevator;
    }

}
