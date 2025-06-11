
package frc.robot.subsystems.IntakeAngle;

import com.MAutils.Subsystems.DeafultSubsystems.Systems.PositionControlledSystem;


public class IntakeAngle extends PositionControlledSystem {
  private static IntakeAngle intakeAngle;
  
  private IntakeAngle() {
    super("Arm", IntakeAngleConstants.systemConstants, 
    IntakeAngleConstants.INTAKE,
    IntakeAngleConstants.IDLE,
    IntakeAngleConstants.L1_ANGLE
    );
  }

  public static IntakeAngle getInstants() {
    if (intakeAngle == null) {
      intakeAngle = new IntakeAngle();
    }

    return intakeAngle;
  }

}
