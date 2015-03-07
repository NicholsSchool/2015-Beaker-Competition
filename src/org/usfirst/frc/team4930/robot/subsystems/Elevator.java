package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Elevator Command
 * 
 * @author John : The elevator command.
 *
 */
public class Elevator extends Subsystem {

	SpeedController pWM3 = RobotMap.elevatorPWM3;
	SpeedController pWM6 = RobotMap.elevatorPWM6;

	public void initDefaultCommand() {
	}

	public void move(double x) {
		pWM3.set(x);
		pWM6.set(-x);
	}

	public void stop() {
		pWM3.set(0.0);
		pWM6.set(0.0);
	}

}