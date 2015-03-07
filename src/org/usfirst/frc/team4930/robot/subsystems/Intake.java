package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Intake Subsystem
 * 
 * @author John : Intake arm subsystem.
 *
 */
public class Intake extends Subsystem {

	SpeedController pWM4 = RobotMap.intakePWM4;
	SpeedController pWM5 = RobotMap.intakePWM5;

	public void initDefaultCommand() {
	}

	public void rotate(double x) {
		pWM4.set(x);
		pWM5.set(-x);
	}

	public void stop() {
		pWM4.set(0.0);
		pWM5.set(0.0);
	}

}