// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
    private final PWMSparkMax m_leftDrive1 = new PWMSparkMax(0); //1 axle shares 2 motors
    private final PWMSparkMax m_leftDrive2 = new PWMSparkMax(5);
    private final PWMSparkMax m_rightDrive1 = new PWMSparkMax(19);
    private final PWMSparkMax m_rightDrive2 = new PWMSparkMax(14);

    public DriveTrain() {
    }

    public void setDrives(double speed) {
        m_leftDrive1.set(speed);
        m_leftDrive2.set(speed);
        m_rightDrive1.set(speed);
        m_rightDrive2.set(speed);
    }

    /**
     * An example method querying a boolean state of the subsystem (for example, a
     * digital sensor).
     *
     * @return value of some boolean subsystem state, such as a digital sensor.
     */
    public boolean exampleCondition() {
        // Query some boolean state, such as a digital sensor.
        return false;
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run during simulation
    }
}
