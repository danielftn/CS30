package phidgetscale;
import com.phidget22.*;

public class OffsetScale 
{
	public static void main(String[] args) throws Exception
	{
	        //Create
	        VoltageRatioInput scale = new VoltageRatioInput();
	        scale.setHubPort(0);
	        
	        
	        //Open
	        scale.open(1000);
	        
	        //Use your Phidgets
	        while(true)
	        {
	            System.out.println("Offset Value: " + scale.getVoltageRatio());
	            Thread.sleep(250);
	        }
	 }    
}
	  

