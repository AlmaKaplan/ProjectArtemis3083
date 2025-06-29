
package frc.robot.commands;

import com.MAutils.RobotControl.SubsystemCommand;

import frc.robot.RobotContainer;
import frc.robot.subsystems.Arm.Arm;

public class ArmCommand extends SubsystemCommand {
    private static Arm arm = RobotContainer.arm;

    public ArmCommand() {
        super(arm);
    }

    public void Automatic() {
        switch (arm.getCurrentState().stateName) {
            case "IDLE":
                arm.setVoltage(0);
                break;
            case "INTAKE":
                arm.setPosition(0);
                break;
            case "SCORING ":
                arm.setPosition(90);
                break;
            case "BALL_ANGLE":
                arm.setPosition(60);
                break;
        }
    }

    public void Manual() {
    }

    public void CantMove() {
        arm.setPosition(arm.getPosition());
    }

}
