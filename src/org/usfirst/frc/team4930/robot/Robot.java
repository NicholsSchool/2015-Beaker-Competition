package org.usfirst.frc.team4930.robot;

import org.usfirst.frc.team4930.robot.commands.Autonomous;
import org.usfirst.frc.team4930.robot.subsystems.Arm;
import org.usfirst.frc.team4930.robot.subsystems.DriveTrain;
import org.usfirst.frc.team4930.robot.subsystems.Elevator;
import org.usfirst.frc.team4930.robot.subsystems.Encoders;
import org.usfirst.frc.team4930.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * Robot Class
 * 
 * @author Sree : The VM is configured to automatically run this class, and to
 *         call the functions corresponding to each mode, as described in the
 *         IterativeRobot documentation. If you change the name of this class or
 *         the package after creating this project, you must also update the
 *         manifest file in the resource directory.
 *
 */
public class Robot extends IterativeRobot {

	Command autonomousCommand;

	public static OI oi;

	public static DriveTrain driveTrain;
	public static Intake intake;
	public static Elevator elevator;
	public static Arm arm;
	public static Encoders encoders;

	public void robotInit() {

		RobotMap.init();

		driveTrain = new DriveTrain();
		intake = new Intake();
		elevator = new Elevator();
		arm = new Arm();
		encoders = new Encoders();

		oi = new OI();

		autonomousCommand = new Autonomous();

	}

	public void disabledInit() {
	}

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	public void autonomousInit() {
		if (autonomousCommand != null) {
			autonomousCommand.start();
		}
	}

	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	public void teleopInit() {
		if (autonomousCommand != null) {
			autonomousCommand.cancel();
		}
	}

	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	public void testPeriodic() {
		LiveWindow.run();
	}

}