package com.fretron.sap.onpremise;

import java.util.Timer;
import java.util.TimerTask;

public class ShipmentSyncDriver {
	
	public static void main(String[] ard)
	{
		 
        Timer timer = new Timer(); 
          
        // creating an instance of task to be scheduled  30 second
        TimerTask task = new TimerHelper(); 
        timer.schedule(task, 1000, 30000); 
        
    }
}
