
package frc.robot.subsystems.Gripper;

import com.MAutils.Subsystems.DeafultSubsystems.Systems.PowerControlledSystem;

import edu.wpi.first.wpilibj.DigitalInput;
import frc.robot.PortMap;

public class Gripper extends PowerControlledSystem {
    private static Gripper gripper;
    private DigitalInput gripperIR;
    
    private Gripper() {
        super("Gripper", GripperConstants.systemConstants,
            GripperConstants.FORWARD,
            GripperConstants.BACKWARD,
            GripperConstants.IDLE);

        gripperIR = new DigitalInput(PortMap.GripperConstants.GRIPPER_IR_SENSOR);
    }

    public boolean isGamePieceInGripper() {
        return gripperIR.get(); 
    }
    
    public static Gripper getInstants() {
        if (gripper == null) {
        gripper = new Gripper();
        }
        return gripper;
    }
}
