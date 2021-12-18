package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.PneumaticsSubsystem;

public class PneumaticsExtendCommand extends InstantCommand {
    public PneumaticsExtendCommand(PneumaticsSubsystem subsystem) {
        super(subsystem::extend, subsystem);
    }
}
