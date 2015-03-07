package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;
import org.usfirst.frc.team4930.robot.commands.TeleOpTankDrive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * DriveTrain Subsystem
 * 
 * @author Thomas Kubiniec : These are the declarations of each speedController,
 *         telling them to allocate to each of the DriveTrain Motors in PMW
 *         ports 0 and 9.
 *
 */
public class DriveTrain extends Subsystem {

	SpeedController pWM0 = RobotMap.driveTrainPWM0;
	SpeedController pWM9 = RobotMap.driveTrainPWM9;
	RobotDrive robotDrive = RobotMap.driveTrainRobotDrive;

	public void initDefaultCommand() {
		setDefaultCommand(new TeleOpTankDrive());
	}

	public void takeJoystickInputs(Joystick left, Joystick right) {
		robotDrive.tankDrive(-left.getY(), -right.getY());
	}

	public void runMotors(double left, double right) {
		robotDrive.tankDrive(-left, -right);
	}

	public void stop() {
		robotDrive.tankDrive(0, 0);
	}

}