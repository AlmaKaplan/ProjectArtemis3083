
package frc.robot.subsystems.Elevator;

import com.MAutils.RobotControl.SubsystemState;
import com.MAutils.Subsystems.DeafultSubsystems.Constants.PositionSystemConstants;

public class ElevatorConstants {

    public static final PositionSystemConstants systemConstants =
    new PositionSystemConstants();


    public static final SubsystemState IDLE = new SubsystemState("IDLE");
    public static final SubsystemState INTAKE = new SubsystemState("INTAKE");
    public static final SubsystemState SCORING  = new SubsystemState("SCORING");
    public static final SubsystemState BALL  = new SubsystemState("BALL");

}
