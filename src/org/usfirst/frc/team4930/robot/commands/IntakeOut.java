package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * IntakeOut Command
 * 
 * @author Thomas : Tells the code that it requires the designated "intake" from
 *         the Robot.java file.
 *
 */
public class IntakeOut extends Command {

	public IntakeOut() {
		requires(Robot.intake);
	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.intake.rotate(-0.8);
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