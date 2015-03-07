package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * TeleOpTankDrive Command
 * 
 * @author Thomas : Tells the code that it requires the designated "driveTrain"
 *         from the Robot.java file.
 *
 */
public class TeleOpTankDrive extends Command {

	public TeleOpTankDrive() {
		requires(Robot.driveTrain);
	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.driveTrain.takeJoystickInputs(Robot.oi.getJoystick0(),
				Robot.oi.getJoystick1());
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.driveTrain.stop();
	}

	protected void interrupted() {
		end();
	}

}