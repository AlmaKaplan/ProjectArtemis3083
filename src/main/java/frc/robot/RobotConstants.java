
package frc.robot;

import com.MAutils.RobotControl.RobotState;

import frc.robot.subsystems.Arm.ArmConstants;
import frc.robot.subsystems.Elevator.ElevatorConstants;
import frc.robot.subsystems.IntakeAngle.IntakeAngleConstants;
import frc.robot.subsystems.IntakeRollers.IntakeRollerConstants;
import frc.robot.subsystems.Transfer.TransferConstants;

public class RobotConstants {

    public static final RobotState IDLE = 
    new RobotState("IDLE", 
    IntakeAngleConstants.IDLE,
    ArmConstants.IDLE,
    ElevatorConstants.IDLE,
    TransferConstants.IDLE);

    public static final RobotState INTAKE = 
    new RobotState("INTAKE", 
    IntakeAngleConstants.INTAKE,
    ArmConstants.INTAKE,
    ElevatorConstants.INTAKE,
    TransferConstants.FORWARD);

}
