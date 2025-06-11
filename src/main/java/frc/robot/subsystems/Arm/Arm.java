
package frc.robot.subsystems.Arm;

import com.MAutils.Subsystems.DeafultSubsystems.Systems.PositionControlledSystem;


public class Arm extends PositionControlledSystem {
  
  public Arm() {
    super("Arm", ArmConstants.systemConstants, 
    ArmConstants.BALL_ANGLE,
    ArmConstants.IDLE,
    ArmConstants.SCORING,
    ArmConstants.INTAKE
    );
  }

  @Override
  public void periodic() {

  }
}
