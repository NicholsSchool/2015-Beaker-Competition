package org.usfirst.frc.team4930.robot;

import org.usfirst.frc.team4930.robot.commands.Autonomous;
import org.usfirst.frc.team4930.robot.commands.ElevatorDown;
import org.usfirst.frc.team4930.robot.commands.ElevatorUp;
import org.usfirst.frc.team4930.robot.commands.ElevatorUpOperator;
import org.usfirst.frc.team4930.robot.commands.IntakeIn;
import org.usfirst.frc.team4930.robot.commands.IntakeOut;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * OI Class
 * 
 * @author Hanna : This class is the glue that binds the controls on the
 *         physical operator interface to the commands and command groups that
 *         allow control of the robot.
 *
 */
public class OI {

	public Joystick joystick0;
	public Joystick joystick1;
	public Joystick joystick2;

	public JoystickButton intakeInButton;
	public JoystickButton intakeOutButton;
	public JoystickButton elevatorUpButton;
	public JoystickButton elevatorDownButton;

	public OI() {

		joystick0 = new Joystick(0);
		joystick1 = new Joystick(1);
		joystick2 = new Joystick(2);

		elevatorDownButton = new JoystickButton(joystick0, 1);
		elevatorDownButton.whileHeld(new IntakeOut());

		elevatorDownButton = new JoystickButton(joystick1, 1);
		elevatorDownButton.whileHeld(new IntakeIn());

		elevatorUpButton = new JoystickButton(joystick1, 3);
		elevatorUpButton.whileHeld(new ElevatorUp());

		elevatorDownButton = new JoystickButton(joystick1, 2);
		elevatorDownButton.whileHeld(new ElevatorDown());

		intakeOutButton = new JoystickButton(joystick2, 1);
		intakeOutButton.whileHeld(new ElevatorUpOperator());

		SmartDashboard.putData("Autonomous", new Autonomous());
		SmartDashboard.putData("IntakeIn", new IntakeIn());
		SmartDashboard.putData("IntakeOut", new IntakeOut());
		SmartDashboard.putData("ElevatorUp", new ElevatorUp());
		SmartDashboard.putData("ElevatorDown", new ElevatorDown());

	}

	public Joystick getJoystick0() {
		return joystick0;
	}

	public Joystick getJoystick1() {
		return joystick1;
	}

	public Joystick getJoystick2() {
		return joystick2;
	}

}