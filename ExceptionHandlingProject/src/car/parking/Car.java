package car.parking;

import java.util.Random;

import car.exception.CoolantException;
import car.exception.PUCException;
import car.exception.SpeedLimitExceededException;
import car.exception.TrafficException;

public class Car
{
	boolean pucStatus=true; //false
	boolean coolantStatus=true; //false
	public int kmCompleted;
	
	public Car() throws CoolantException, PUCException
	{
		System.out.println("Checking the car...");
		//checkPUC();
		
		if(pucStatus==true) {
			System.out.println("Checking all the docs..");

		}
		else {
			PUCException ex = new PUCException("PUC is expired...");
			throw ex;
		}
		
		System.out.println("Cheking the engine oil");
		System.out.println("checking the coolant...");
		//checkCoolant();
		if(coolantStatus==true) {
			System.out.println("Coolant is sufficient");
		}
		else {
			//CoolantException ex = new CoolantException("Coolant need to be refilled");
			//throw ex;
			throw new CoolantException("Coolant need to be refilled");
			
		}
		System.out.println("all ok...");

	}
	private void checkPUC() {
		Random random = new Random();
		pucStatus = random.nextBoolean();
		
	}
	private void checkCoolant() {
		
		Random random = new Random();
		coolantStatus = random.nextBoolean();
//		for(int i=1;i<10;i++) {
//			double val = Math.random()%10; // 0 to 1
//			//System.out.println("val "+val);
//			if(val > 0.90) {
//				//System.out.println("Coolant is sufficient");
//				coolantStatus =true;
//				break;
//			}
//			else if(val<0.75) {
//				//System.out.println("Coolant need to be refilled");
//				coolantStatus = false;
//				break;
//			}
//		}
	}
	
	//throws mean the below method is susceptible to throw following type of checked excpetion
	
	public void longDrive() 
	{
			for (int i = 1; i <= 30; i++) {
			System.out.println("Km completed..."+i);
			//Random random = new Random();
			//int val = random.nextInt(120)+1;
			//System.out.println("val "+val);
			double val = Math.random()%10; // 0 to 1
			//System.out.println("val "+val);
			
			if(val > 0.98) {
				SpeedLimitExceededException ex = new SpeedLimitExceededException("Speed limit exceeded..it was supposed to be upto 80 : current speed was "+val);
				
				throw ex;
			}
			
			double val2 = Math.random()%10; // 0 to 1
			//System.out.println("val "+val);
			
			if(val2 > 0.98) {
				TrafficException ex = new TrafficException("Traffic is heavy..searching alternate route : ");
				throw ex;
			}
			
			kmCompleted = i;
			
		}
		System.out.println("JOURNEY OVER.....");
	}
}