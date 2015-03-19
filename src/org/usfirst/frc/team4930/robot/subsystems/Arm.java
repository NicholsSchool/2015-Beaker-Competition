package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Arm Subsystem
 * 
 * @author Thomas : Defining a Talon at PMW 2 to the Ports in the RobotMap.
 *
 */
public class Arm extends Subsystem {

	SpeedController pWM2 = RobotMap.armPWM2;

	public void initDefaultCommand() {
	}

	public void moveCan(double x) {
		pWM2.set(x);
	}

	public void stop() {
		pWM2.set(0.0);
	}

}