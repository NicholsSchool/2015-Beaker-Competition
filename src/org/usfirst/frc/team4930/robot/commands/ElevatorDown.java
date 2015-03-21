package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;
import org.usfirst.frc.team4930.robot.subsystems.Elevator;

import edu.wpi.first.wpilibj.command.Command;

/**
 * ElevatorDown Command
 * 
 * @author Thomas : Telling the code that it needs the designated "elevator"
 *         from the Robot.java file
 *
 */
public class ElevatorDown extends Command {

	public ElevatorDown() {
		requires(Robot.elevator);
	}

	protected void initialize() {
	}

	protected void execute() {
		// if (Robot.elevator.getPotVal() > Elevator.bottomVal) {
		Robot.elevator.move(Elevator.downSpeed);
		// }
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