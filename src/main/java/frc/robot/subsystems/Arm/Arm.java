
package frc.robot.subsystems.Arm;

import com.MAutils.Subsystems.DeafultSubsystems.Systems.PositionControlledSystem;


public class Arm extends PositionControlledSystem {
  public static Arm arm;
  
  public Arm() {
    super("Arm", ArmConstants.systemConstants, 
    ArmConstants.BALL_ANGLE,
    ArmConstants.IDLE,
    ArmConstants.SCORING,
    ArmConstants.INTAKE
    );
  }

  public static Arm getInstants() {
    if (arm == null) {
      arm = new Arm();
    }
    return arm;
  }
}
