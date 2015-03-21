package org.usfirst.frc.team4930.robot;

import org.usfirst.frc.team4930.robot.commands.ArmDown;
import org.usfirst.frc.team4930.robot.commands.ArmUp;
import org.usfirst.frc.team4930.robot.commands.Autonomous;
import org.usfirst.frc.team4930.robot.commands.ElevatorDown;
import org.usfirst.frc.team4930.robot.commands.ElevatorDownAllTheWay;
import org.usfirst.frc.team4930.robot.commands.ElevatorUp;
import org.usfirst.frc.team4930.robot.commands.ElevatorUpAllTheWay;
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
	public JoystickButton elevatorUpAllTheWayButton;
	public JoystickButton elevatorDownAllTheWayButton;

	public JoystickButton elevatorUpOperatorButton;

	public JoystickButton armUpButton;
	public JoystickButton armDownButton;

	public OI() {

		joystick0 = new Joystick(0);
		joystick1 = new Joystick(1);
		joystick2 = new Joystick(2);

		intakeOutButton = new JoystickButton(joystick0, 1);
		intakeOutButton.whileHeld(new IntakeOut());

		intakeInButton = new JoystickButton(joystick1, 1);
		intakeInButton.whileHeld(new IntakeIn());

		elevatorUpButton = new JoystickButton(joystick1, 3);
		elevatorUpButton.whileHeld(new ElevatorUp());

		elevatorDownButton = new JoystickButton(joystick1, 2);
		elevatorDownButton.whileHeld(new ElevatorDown());

		elevatorUpAllTheWayButton = new JoystickButton(joystick0, 6);
		elevatorUpAllTheWayButton.whileHeld(new ElevatorUpAllTheWay());

		elevatorDownAllTheWayButton = new JoystickButton(joystick0, 7);
		elevatorDownAllTheWayButton.whileHeld(new ElevatorDownAllTheWay());

		elevatorUpOperatorButton = new JoystickButton(joystick2, 1);
		elevatorUpOperatorButton.whileHeld(new ElevatorUpOperator());

		armUpButton = new JoystickButton(joystick2, 6);
		armUpButton.whileHeld(new ArmUp());

		armDownButton = new JoystickButton(joystick2, 7);
		armDownButton.whileHeld(new ArmDown());

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