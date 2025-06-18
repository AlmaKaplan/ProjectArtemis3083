
package frc.robot;

public class SuperStructure {

    public static boolean hasGamePiece() {
        return RobotContainer.intakeRoller.isGamePieceInIntake() 
        || RobotContainer.transfer.isGamePieceInTransfer() 
        || RobotContainer.gripper.isGamePieceInGripper();
    }
}
