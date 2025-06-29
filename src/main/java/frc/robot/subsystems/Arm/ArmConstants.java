
package frc.robot.subsystems.Arm;

import com.MAutils.RobotControl.SubsystemState;
import com.MAutils.Subsystems.DeafultSubsystems.Constants.PositionSystemConstants;

import edu.wpi.first.math.system.plant.DCMotor;

public class ArmConstants {

    public static final PositionSystemConstants systemConstants = new PositionSystemConstants()
    .withPID(0.1, 0, 0, 1).withPoseLimits(0, 180, 0)
    .withMotors();

    public static final SubsystemState IDLE = new SubsystemState("IDLE");
    public static final SubsystemState INTAKE = new SubsystemState("INTAKE");
    public static final SubsystemState SCORING  = new SubsystemState("SCORING");
    public static final SubsystemState BALL_ANGLE  = new SubsystemState("BALL_ANGLE");

}
