
package frc.robot.commands;

import com.MAutils.RobotControl.SubsystemCommand;

import frc.robot.RobotContainer;
import frc.robot.subsystems.IntakeAngle.IntakeAngle;

public class IntakeAngleCmmand extends SubsystemCommand {
    private static IntakeAngle intakeArm = RobotContainer.intakeAngle;

    public IntakeAngleCmmand() {
        super(intakeArm);
    }

    public void Automatic() {
        switch (intakeArm.getCurrentState().stateName) {
            case "IDLE":
                intakeArm.setVoltage(0);
                break;
            case "INTAKE":
                intakeArm.setPosition(0);
                break;
            case "SCORING ":
                intakeArm.setPosition(90);
                break;
            case "BALL_ANGLE":
                intakeArm.setPosition(60);
                break;
        }
    }

    public void Manual() {
    }

    public void CantMove() {
        intakeArm.setPosition(intakeArm.getPosition());
    }

}
