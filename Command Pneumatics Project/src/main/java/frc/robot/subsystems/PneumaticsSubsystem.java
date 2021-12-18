// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class PneumaticsSubsystem extends SubsystemBase {
    DoubleSolenoid doubleSolenoid;

    public PneumaticsSubsystem() {
        doubleSolenoid = new DoubleSolenoid(Constants.EXTEND_SOLENOID_ID, Constants.RETRACT_SOLENOID_ID);
    }

    public void extend() {
        doubleSolenoid.set(Value.kForward);
    }

    public void retract() {
        doubleSolenoid.set(Value.kReverse);
    }

    public void disable() {
        doubleSolenoid.set(Value.kOff);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}
