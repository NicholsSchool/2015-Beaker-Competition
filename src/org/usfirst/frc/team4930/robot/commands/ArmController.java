package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * ArmController Command
 * 
 * @author Thomas : telling the code that it needs the designated "arm"
 *
 */
public class ArmController extends Command {

	public ArmController() {
		requires(Robot.arm);
	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.arm.moveCan(Robot.oi.joystick2.getY());
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.arm.stop();
	}

	protected void interrupted() {
		Robot.arm.stop();
	}

}