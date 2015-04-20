package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;
import org.usfirst.frc.team4930.robot.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class Autonomous extends Command {

	public Autonomous() {
		requires(Robot.driveTrain);
	}

	protected void initialize() {
	}

	protected void execute() {
		RobotMap.driveTrainRobotDrive.setSafetyEnabled(false);
		// this.autoCenterCanHook();
		this.newOne();
	}

	protected void newOne() {
		// raise can all the way up
		// back up
		this.moveArm(-0.55, 4.1);
		this.wait(0.5);
		this.moveRobot(-0.65, 1.25);
	}

	protected void doNothing() {
	}

	protected void autoCenterCanHook() {
		this.moveRobot(-0.65, 4.0);
		this.wait(0.5);
		this.moveArm(1.0, 0.5);
		this.wait(0.5);
		this.moveRobot(0.7, 2.5);
	}

	protected void autoPickupCanDriveForward() {
		this.moveArm(-0.45, 2.5);
		this.wait(1.0);
		this.moveRobot(0.7, 2.5);

	}

	protected void autoMoveForward() {
		this.moveRobot(0.75, 2.0);
	}

	/**
	 * moveRobotManual
	 * 
	 * @param leftSpeed
	 * @param rightSpeed
	 * @param approx
	 */
	protected void moveRobotManual(double leftSpeed, double rightSpeed,
			double approx) {
		Robot.driveTrain.runMotors(-leftSpeed, -rightSpeed);
		Timer.delay(approx);
		Robot.driveTrain.stop();
	}

	/**
	 * moveArm
	 * 
	 * @param speed
	 * @param approx
	 */
	protected void moveArm(double speed, double approx) {
		Robot.arm.moveCan(speed);
		Timer.delay(approx);
		Robot.arm.stop();
	}

	/**
	 * moveRobot
	 * 
	 * @param speed
	 * @param approx
	 */
	protected void moveRobot(double speed, double approx) {
		Robot.driveTrain.runMotors(-speed, -speed);
		Timer.delay(approx);
		Robot.driveTrain.stop();
	}

	/**
	 * turnRobotLeft
	 * 
	 * @param speed
	 * @param approx
	 */
	protected void turnRobotLeft(double speed, double approx) {
		Robot.driveTrain.runMotors(-speed, speed);
		Timer.delay(approx);
		Robot.driveTrain.stop();
	}

	/**
	 * turnRobotRight
	 * 
	 * @param speed
	 * @param approx
	 */
	protected void turnRobotRight(double speed, double approx) {
		Robot.driveTrain.runMotors(speed, -speed);
		Timer.delay(approx);
		Robot.driveTrain.stop();
	}

	/**
	 * wait
	 * 
	 * @param approx
	 */
	protected void wait(double approx) {
		Timer.delay(approx);
	}

	/**
	 * moveElevator
	 * 
	 * @param speed
	 * @param approx
	 */
	protected void moveElevator(double speed, double approx) {
		Robot.elevator.move(speed);
		Timer.delay(approx);
		Robot.elevator.stop();
	}

	/**
	 * moveIntakeIn
	 * 
	 * @param approx
	 */
	protected void moveIntakeIn(double approx) {
		Robot.intake.rotate(0.75);
		Timer.delay(approx);
		Robot.intake.stop();
	}

	/**
	 * moveIntakeOut
	 * 
	 * @param approx
	 */
	protected void moveIntakeOut(double approx) {
		Robot.intake.rotate(-0.75);
		Timer.delay(approx);
		Robot.intake.stop();
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return true;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}