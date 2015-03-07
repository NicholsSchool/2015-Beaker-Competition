package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;
import org.usfirst.frc.team4930.robot.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.*;

/**
 * DriveTrain Subsystem
 * 
 * @author Thomas Kubiniec
 * speedController declarations
 * allocates DriveTrain Motors
 * PMW ports 0 and 9.
 *
 */
public class DriveTrain extends Subsystem {
	
    SpeedController pWM0 = RobotMap.driveTrainPWM0;
    SpeedController pWM9 = RobotMap.driveTrainPWM9;
    RobotDrive robotDrive = RobotMap.driveTrainRobotDrive;

    public void initDefaultCommand() {
        setDefaultCommand(new TeleOpTankDrive());
    }
    
    public void takeJoystickInputs(Joystick left, Joystick right){
    	robotDrive.tankDrive(-left.getY(), -right.getY());
    }
    
    public void runMotors(double left, double right){
    	robotDrive.tankDrive(-left, -right);
    }
    
    public void stop() {
    	robotDrive.tankDrive(0, 0);
    }
    
}