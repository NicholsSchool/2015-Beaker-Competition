package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Elevator Command
 * 
 * @author John : The elevator command.
 *
 */
public class Elevator extends Subsystem {

	AnalogPotentiometer elevatorPotentiometer = new AnalogPotentiometer(0, 1.0,
			0.0);

	SpeedController pWM3 = RobotMap.elevatorPWM3;
	SpeedController pWM6 = RobotMap.elevatorPWM6;

	public static double topVal = 0.307;
	public static double bottomVal = 0.440;

	public static double upSpeed = 0.75;
	public static double downSpeed = -0.75;
	public static double downSpeedSlow = -0.33;

	public static double maintainSpeed = 0.25;

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

	public double getPotVal() {
		return elevatorPotentiometer.get();
	}

}