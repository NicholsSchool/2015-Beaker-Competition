package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * IntakeIn Command
 * 
 * @author Thomas : Tells the code that it requires the designated "intake" from
 *         the Robot.java file.
 *
 */
public class IntakeIn extends Command {

	public IntakeIn() {
		requires(Robot.intake);
	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.intake.rotate(-0.75);
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.intake.stop();
	}

	protected void interrupted() {
		Robot.intake.stop();
	}

}