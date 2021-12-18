package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.PneumaticsSubsystem;

public class PneumaticsRetractCommand extends InstantCommand {
    public PneumaticsRetractCommand(PneumaticsSubsystem subsystem) {
        super(subsystem::retract, subsystem);
    }
}
