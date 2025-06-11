
package frc.robot.subsystems.IntakeAngle;

import com.MAutils.RobotControl.SubsystemState;
import com.MAutils.Subsystems.DeafultSubsystems.Constants.PositionSystemConstants;

public class IntakeAngleConstants {

    public static final PositionSystemConstants systemConstants =
    new PositionSystemConstants();


    public static final SubsystemState IDLE = new SubsystemState("IDLE");
    public static final SubsystemState L1_ANGLE  = new SubsystemState("L1_ANGLE ");
    public static final SubsystemState INTAKE  = new SubsystemState("INTAKE");

}
