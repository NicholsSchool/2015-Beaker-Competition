package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;
import org.usfirst.frc.team4930.robot.commands.ArmController;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Arm Subsystem
 * 
 * @author Thomas : Defining a Talon at PMW 2 to the Ports in the RobotMap.
 *
 */
public class Arm extends Subsystem {

	double highPotExtreme = 0.724; // 720 (second indiction)
	double lowPotExtreme = 0.666;

	SpeedController pWM2 = RobotMap.armPWM2;

	AnalogPotentiometer armPotentiometer = new AnalogPotentiometer(1, 1.0, 0.0);

	public void initDefaultCommand() {
		setDefaultCommand(new ArmController());
	}

	public void moveCan(double x) {

		double armPotValue = this.getPotVal();

		// if (armPotValue > lowPotExtreme && armPotValue < highPotExtreme) {
		pWM2.set(x);
		// }

	}

	public void stop() {
		pWM2.set(0.0);
	}

	public double getPotVal() {
		return armPotentiometer.get();
	}
}