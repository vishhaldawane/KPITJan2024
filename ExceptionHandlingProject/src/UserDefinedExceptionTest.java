import java.util.Random;
import java.util.stream.IntStream;

import car.exception.*;
import car.parking.Car;


public class UserDefinedExceptionTest {

	public static void main(String[] args) //throws CoolantException 
	{
		System.out.println("Begin main");
		
		Car myCar = null;
		
			//Unhandled exception type CoolantException
			try {
				 myCar = new Car();
			}
			catch (CoolantException e) {
				System.out.println("Some problem1 : "+e.getMessage());
			}
			catch(PUCException e) {
				System.out.println("Some problem2 : "+e.getMessage());
			}
			
	while(true) {		
			if(myCar!=null) {	
				try {
					myCar.longDrive();	
				}
				catch(SpeedLimitExceededException e) {
					System.out.println("Some problem3 : "+e.getMessage());
					//wallet is subtracted 
				}
				catch(TrafficException e) {
					System.out.println("Some problem4 : "+e.getMessage());
								
				}
			}
			else {
				System.out.println("Car is not ready...");
			}
			
		if(myCar.kmCompleted==30) {
			break;
		}
		
		System.out.println("========================");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
			
			//100
		System.out.println("End main");
	}

}





