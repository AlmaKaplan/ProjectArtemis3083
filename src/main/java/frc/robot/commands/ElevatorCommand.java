
package frc.robot.commands;

import com.MAutils.RobotControl.SubsystemCommand;

import frc.robot.RobotContainer;
import frc.robot.subsystems.Elevator.Elevator;

public class ElevatorCommand extends SubsystemCommand {
    private static Elevator elevator = RobotContainer.elevator;

    public ElevatorCommand() {
        super(elevator);
    }

    public void Automatic() {
        switch (elevator.getCurrentState().stateName) {
            case "IDLE":
                elevator.setPosition(0);
                break;
            case "INTAKE":
                elevator.setPosition(0);
                break;
            case "SCORING ":
                elevator.setPosition(1);
                break;
            case "BALL":
                elevator.setPosition(0.5);
                break;
        }
    }

    public void Manual() {
    }

    public void CantMove() {
        elevator.setPosition(elevator.getPosition());
    }

}
