
package frc.robot;

import com.MAutils.Controllers.PS5MAController;
import com.MAutils.RobotControl.DeafultRobotContainer;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Arm.Arm;
import frc.robot.subsystems.Elevator.Elevator;
import frc.robot.subsystems.Gripper.Gripper;
import frc.robot.subsystems.IntakeAngle.IntakeAngle;
import frc.robot.subsystems.IntakeRollers.IntakeRoller;
import frc.robot.subsystems.Transfer.Transfer;

public class RobotContainer extends DeafultRobotContainer{

  public static Arm arm;
  public static Elevator elevator;
  public static Transfer transfer;
  public static IntakeAngle intakeAngle;
  public static IntakeRoller intakeRoller;
  public static Gripper gripper;

  public RobotContainer() {
    arm = Arm.getInstants();
    elevator = Elevator.getInstants();
    transfer = Transfer.getInstants();
    intakeAngle = IntakeAngle.getInstants();
    intakeRoller = IntakeRoller.getInstants();
    gripper = Gripper.getInstants();

    setDriverController(new PS5MAController(0));
    setDriverController(new PS5MAController(1));

    configureBindings();
  }

  private void configureBindings() {
    T(() -> driverController.getMiddle(), RobotConstants.IDLE).build();


    T(() -> driverController.getL1() && !SuperStructure.hasGamePiece(), RobotConstants.INTAKE).build();

    T(() -> SuperStructure.hasGamePiece(), RobotConstants.IDLE).withInRobotState(RobotConstants.INTAKE).build();

  }

  public Command getAutonomousCommand() {
    return null;
  }
}
