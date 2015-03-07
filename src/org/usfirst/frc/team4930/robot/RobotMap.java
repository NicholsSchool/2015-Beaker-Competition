package org.usfirst.frc.team4930.robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * RobotMap Class
 * 
 * @author Hanna : The RobotMap is a mapping from the ports sensors and
 *         actuators are wired into to a variable name. This provides
 *         flexibility changing wiring, makes checking the wiring easier and
 *         significantly reduces the number of magic numbers floating around.
 *
 */
public class RobotMap {

	public static SpeedController driveTrainPWM0;
	public static SpeedController driveTrainPWM9;

	public static RobotDrive driveTrainRobotDrive;

	public static SpeedController intakePWM4;
	public static SpeedController intakePWM5;
	public static SpeedController elevatorPWM3;
	public static SpeedController elevatorPWM6;
	public static SpeedController armPWM2;
	public static SpeedController armPWM7;

	public static Encoder encodersLeftDriveTrain;
	public static Encoder encodersRightDriveTrain;

	public static void init() {

		driveTrainPWM0 = new TalonSRX(0);
		LiveWindow.addActuator("DriveTrain", "PWM0", (TalonSRX) driveTrainPWM0);

		driveTrainPWM9 = new TalonSRX(9);
		LiveWindow.addActuator("DriveTrain", "PWM9", (TalonSRX) driveTrainPWM9);

		driveTrainRobotDrive = new RobotDrive(driveTrainPWM0, driveTrainPWM9);

		driveTrainRobotDrive.setSafetyEnabled(true);
		driveTrainRobotDrive.setExpiration(0.1);
		driveTrainRobotDrive.setSensitivity(0.5);
		driveTrainRobotDrive.setMaxOutput(1.0);

		intakePWM4 = new TalonSRX(4);
		LiveWindow.addActuator("Intake", "PWM4", (TalonSRX) intakePWM4);

		intakePWM5 = new TalonSRX(5);
		LiveWindow.addActuator("Intake", "PWM5", (TalonSRX) intakePWM5);

		elevatorPWM3 = new TalonSRX(3);
		LiveWindow.addActuator("Elevator", "PWM3", (TalonSRX) elevatorPWM3);

		elevatorPWM6 = new TalonSRX(6);
		LiveWindow.addActuator("Elevator", "PWM6", (TalonSRX) elevatorPWM6);

		armPWM2 = new TalonSRX(2);
		LiveWindow.addActuator("Arm", "PWM2", (TalonSRX) armPWM2);

		armPWM7 = new TalonSRX(7);
		LiveWindow.addActuator("Arm", "PWM7", (TalonSRX) armPWM7);

	}

}