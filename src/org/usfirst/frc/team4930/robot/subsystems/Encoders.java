// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;
import org.usfirst.frc.team4930.robot.commands.*;

import edu.wpi.first.wpilibj.CounterBase.EncodingType; 
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Encoders extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    Encoder leftDriveTrain = RobotMap.encodersLeftDriveTrain;
    Encoder rightDriveTrain = RobotMap.encodersRightDriveTrain;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    	
    	leftDriveTrain.reset();
    	int count = leftDriveTrain.get();
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void resetBoth(){
    	leftDriveTrain.reset();
    	rightDriveTrain.reset();
    }
    
    public void resetLeftDriveTrain(){
    	leftDriveTrain.reset();
    }
    
    public void resetRightDriveTrain(){
    	rightDriveTrain.reset();
    }
    
    public int getLeftDriveTrain(){
    	return leftDriveTrain.get();
    }
    
    public int getRightDriveTrain(){
    	return rightDriveTrain.get();
    }
    
}

