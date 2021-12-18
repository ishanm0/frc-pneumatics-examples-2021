package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.PneumaticsSubsystem;

public class PneumaticsDisableCommand extends InstantCommand {
    public PneumaticsDisableCommand(PneumaticsSubsystem subsystem) {
        super(subsystem::disable, subsystem);
    }
}
