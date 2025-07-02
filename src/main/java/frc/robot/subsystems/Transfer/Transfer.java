
package frc.robot.subsystems.Transfer;

import com.MAutils.Subsystems.DeafultSubsystems.Systems.PowerControlledSystem;

import edu.wpi.first.wpilibj.DigitalInput;
import frc.robot.PortMap;


public class Transfer extends PowerControlledSystem{
    private static Transfer intakeRoller;
    private DigitalInput transferIR;

    private Transfer() {
        super("Transfer", TransferConstants.systemConstants,
        TransferConstants.IDLE,
        TransferConstants.FORWARD,
        TransferConstants.REVERSE);
        transferIR = new DigitalInput(PortMap.TransferConstants.TRANSFER_IR_SENSOR);
    }

    public boolean isGamePieceInTransfer() {
        return transferIR.get();
    }

    public static Transfer getInstants() {
        if (intakeRoller == null) {
            intakeRoller = new Transfer();
        }
    
        return intakeRoller;
      }
// GHJGHK
}
