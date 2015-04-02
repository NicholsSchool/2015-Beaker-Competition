package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;
import org.usfirst.frc.team4930.robot.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 * 
 * @author Thomas, Tannay, Sree : Autonomous code this runs once since the
 *         isFinished() method is set to true. This code uses the Robot.java
 *         file's "driveTrain".
 *
 */
public class Autonomous extends Command {

	public Autonomous() {
		requires(Robot.driveTrain);
	}

	protected void initialize() {
	}

	protected void execute() {

		RobotMap.driveTrainRobotDrive.setSafetyEnabled(false);

		// this.doNothing();
		// this.awesomeAuto();
		// this.sampleAuto();
		this.dillianAuto();
	}

	protected void autoFinals() {
		this.moveRobot(-0.65, 4.0);
		this.wait(0.5);
		this.moveArm(1.0, 0.5);
		this.wait(0.5);
		this.moveRobot(0.7, 2.5);
	}

	protected void dillianAuto() {

		this.moveArm(-0.45, 2.5);
		this.wait(1.0);

		// at 0.7 speed
		// for 2.5 seconds
		// it travels 11 feet 10 inches

		this.moveRobot(0.7, 2.5);

	}

	protected void simpleAuto() {

		this.moveRobot(0.75, 2.0);

	}

	protected void doNothing() {

	}

	protected void awesomeAuto() {

		// Original Autonomous Pseudocde
		// 1. drive x rotations
		// 2. intake tote
		// 3. lift tote
		// 4. lift can
		// 5. drive x rotations
		// 6. intake 2nd tote/lift 2nd tote
		// 7. turn 45 degrees
		// 8. drive x rotations(+, +)
		// 9. elevator down
		// 10. back away
		// 11. intake motors out

		this.moveElevator(1.0, 1.0);

		this.moveRobot(0.5, 1.0);

		this.wait(0.5);

		this.moveIntakeIn(3.0);

		this.moveElevator(-1.0, 1.0);

		this.moveElevator(1.0, 1.0);

		this.turnRobotLeft(.25, 1.5);

		this.moveRobotManual(0.75, 0.5, 1.0);

		this.moveRobot(.75, 5.5);

	}

	protected void sampleAuto() {

		// move robot forward at half speed for one second
		this.moveRobot(0.5, 1.0);

		// do nothing for a half second
		this.wait(0.5);

		// move elevator up full speed for half a second
		this.moveElevator(1.0, 0.5);

		// do nothing for a half second
		this.wait(0.5);

		// rotate intake motors in for one second
		this.moveIntakeIn(1.0);

		// do nothing for a half second
		this.wait(0.5);

		// rotate intake motors out for one second
		this.moveIntakeOut(1.0);

		// do nothing for a half second
		this.wait(0.5);

		// move arm down at half speed for one second
		this.moveArm(0.5, 1.0);

		// turn left at half speed for one second
		this.turnRobotLeft(0.5, 1.0);

		// turn right at half speed for one second
		this.turnRobotRight(0.5, 1.0);

		// run left motor forward at 75% and right motor forward at 50% a second
		this.moveRobotManual(0.75, 0.5, 1.0);

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