
package frc.robot.subsystems.Transfer;

import com.MAutils.Subsystems.DeafultSubsystems.Systems.PowerControlledSystem;


public class Transfer extends PowerControlledSystem{
    private static Transfer intakeRoller;

    private Transfer() {
        super("Transfer", TransferConstants.systemConstants,
        TransferConstants.IDLE,
        TransferConstants.FORWARD,
        TransferConstants.REVERSE);
    }

    public static Transfer getInstants() {
        if (intakeRoller == null) {
            intakeRoller = new Transfer();
        }
    
        return intakeRoller;
      }

}
