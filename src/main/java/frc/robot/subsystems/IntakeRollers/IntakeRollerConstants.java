package frc.robot.subsystems.IntakeRollers;

import com.MAutils.RobotControl.SubsystemState;
import com.MAutils.Subsystems.DeafultSubsystems.Constants.PowerSystemConstants;

/** Add your docs here. */
public class IntakeRollerConstants {

    public static final PowerSystemConstants systemConstants = new PowerSystemConstants();

    public static SubsystemState INTAKE = new SubsystemState( "INTAKE");
    public static SubsystemState IDLE = new SubsystemState("IDLE");
    public static SubsystemState L1_EJECT = new SubsystemState("L1_EJECT");

    public static final double INTAKE_VOLT = 0.5;
    public static final double EJECT_L1_VOLTAGE = -0.5;
}


