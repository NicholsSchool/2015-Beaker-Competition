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
public class ElevatorUp extends Command {

	public ElevatorUp() {
		requires(Robot.elevator);
	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.elevator.move(1.0);
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.elevator.stop();
	}

	protected void interrupted() {
		Robot.elevator.stop();
	}

}