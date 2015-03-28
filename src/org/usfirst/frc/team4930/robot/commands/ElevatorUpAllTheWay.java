package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;
import org.usfirst.frc.team4930.robot.subsystems.Elevator;

import edu.wpi.first.wpilibj.command.Command;

/**
 * ElevatorUp Command
 * 
 * @author Thomas : Telling the code that it needs the designated "elevator"
 *         from the Robot.java file.
 *
 */
public class ElevatorUpAllTheWay extends Command {

	public ElevatorUpAllTheWay() {
		requires(Robot.elevator);
	}

	protected void initialize() {
	}

	protected void execute() {

		while (Robot.elevator.getPotVal() > Elevator.topVal) {
			Robot.elevator.move(Elevator.upSpeed);
		}

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