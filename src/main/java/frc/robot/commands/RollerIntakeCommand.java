
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

    @Override
    public void Automatic() {
        switch (intake.getCurrentState().stateName) {
            case "IDLE":
                intake.setVoltage(0);
                break;
            case "INTAKE":
                intake.setVoltage(IntakeRollerConstants.INTAKE_VOLT);
                break;
            case "L1_EJECT":
                intake.setVoltage(0.5);
                break;
        }
    }

    @Override
    public void Manual() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Manual'");
    }

    @Override
    public void CantMove() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CantMove'");
    }
}
