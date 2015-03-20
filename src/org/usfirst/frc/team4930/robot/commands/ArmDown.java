package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * ElevatorUp Command
 * 
 * @author Thomas : Telling the code that it needs the designated "elevator"
 *         from the Robot.java file.
 *
 */
public class ArmDown extends Command {

	public ArmDown() {
		requires(Robot.arm);
	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.arm.moveCan(-0.45);
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