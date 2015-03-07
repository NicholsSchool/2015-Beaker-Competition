package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Encoders Subsystem
 * 
 * @author Thomas : Methods that control this subsystem.
 *
 */
public class Encoders extends Subsystem {

	Encoder leftDriveTrain = RobotMap.encodersLeftDriveTrain;
	Encoder rightDriveTrain = RobotMap.encodersRightDriveTrain;

	public void initDefaultCommand() {
		leftDriveTrain.reset();
	}

	public void resetBoth() {
		leftDriveTrain.reset();
		rightDriveTrain.reset();
	}

	public void resetLeftDriveTrain() {
		leftDriveTrain.reset();
	}

	public void resetRightDriveTrain() {
		rightDriveTrain.reset();
	}

	public int getLeftDriveTrain() {
		return leftDriveTrain.get();
	}

	public int getRightDriveTrain() {
		return rightDriveTrain.get();
	}

}
