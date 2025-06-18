
package frc.robot.subsystems.Gripper;

import com.MAutils.RobotControl.SubsystemState;
import com.MAutils.Subsystems.DeafultSubsystems.Constants.PowerSystemConstants;

public class GripperConstants {
    public static final PowerSystemConstants systemConstants = new PowerSystemConstants();

    public static final SubsystemState IDLE = new SubsystemState("IDLE");
    public static final SubsystemState FORWARD = new SubsystemState("FORWARD");
    public static final SubsystemState BACKWARD = new SubsystemState("BACKWARD");

}
