
package frc.robot.commands;

import com.MAutils.RobotControl.SubsystemCommand;

import frc.robot.RobotContainer;
import frc.robot.subsystems.IntakeRollers.IntakeRoller;
import frc.robot.subsystems.IntakeRollers.IntakeRollerConstants;

public class RollerIntakeCommand extends SubsystemCommand {
    private static IntakeRoller intake = RobotContainer.intakeRoller;

    public RollerIntakeCommand() {
        super(intake);
    }

    public void Automatic() {
        switch (intake.getCurrentState().stateName) {
            case "IDLE":
                intake.setVoltage(0);
                break;
            case "INTAKE":
                intake.setVoltage(IntakeRollerConstants.INTAKE_VOLT);
                break;
            case "L1_EJECT":
                intake.setVoltage(IntakeRollerConstants.EJECT_L1_VOLTAGE);
                break;
        }
    }


    public void Manual() {
 
    }


    public void CantMove() {
        intake.setVoltage(0);
    }
}
