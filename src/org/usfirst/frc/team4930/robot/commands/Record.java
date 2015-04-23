package org.usfirst.frc.team4930.robot.commands;

import java.io.IOException;

import org.usfirst.frc.team4930.robot.BTMacroRecord;
import org.usfirst.frc.team4930.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * ArmController Command
 * 
 * @author Thomas : Telling the code that it needs the designated "arm".
 *
 */
public class Record extends Command {

	public Record() {
		
	}
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}



	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		this.recordStuff();
		
	}
	protected void recordStuff(){
		BTMacroRecord recorder = null;
        try {
			recorder = new BTMacroRecord();
			
			recorder.record();
	
    		recorder.end();
    		
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
    	//while(isOperatorControl())
//    	{
    		//the statement in this "if" checks if a button you designate as your record button 
    		//has been pressed, and stores the fact that it has been pressed in a variable
//    		if (storage.robot.getRecordButton().getButtonValue())
//			{
//    			Robot.isRecording = !Robot.isRecording;
//			}  
			//if our record button has been pressed, lets start recording!
//			if (Robot.isRecording)
//			{
//    			try
//    			{
    				//if we succesfully have made the recorder object, lets start recording stuff
    				//2220 uses a storage object that we can get motors values, etc. from.
    				//if you don't need to pass an object like that in, modify the methods/classes
//    				if(recorder != null)
//    				{
//    					
//    				}
//    			
//				}
//				catch (IOException e) 
//				{
//				}
//			}
//		}
		
		//once we're done recording, the last thing we'll do is clean up the recording using the end
		//function. more info on the end function is in the record class
//    	try 
//    	{
//		} 
//		catch (IOException e) 
//		{
//			e.printStackTrace();
//		}
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}



	


}