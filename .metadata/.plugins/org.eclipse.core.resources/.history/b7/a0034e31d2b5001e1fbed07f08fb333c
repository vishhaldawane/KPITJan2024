
public class PolymorphismTest {

	public static void main(String[] args) {
		Doctor doctorRef = new HeartSurgeon();
	//	Surgeon surgeonRef = new Surgeon();
	//	HeartSurgeon heartSurgeonRef = new HeartSurgeon();
	
		
	if( doctorRef instanceof Doctor) {
		System.out.println("Yes it is pointing at Doctor");
		doctorRef.diagnose();
	}
	else {
		System.out.println("NO, it is not pointing at Doctor");
	}
	
	System.out.println("------------");
	
	if( doctorRef instanceof Surgeon) {
		System.out.println("Yes it is pointing at Surgeon");
		doctorRef.diagnose();
		Surgeon s = (Surgeon) doctorRef;
		s.doSurgery();
		
	}
	else {
		System.out.println("NO, it is not pointing at Surgeon");
	}
	
	System.out.println("------------");
	
	if( doctorRef instanceof HeartSurgeon) {
		System.out.println("Yes it is pointing at HeartSurgeon");
		doctorRef.diagnose();
		Surgeon s = (Surgeon) doctorRef;
		s.doSurgery();
		
		HeartSurgeon hs = (HeartSurgeon) doctorRef;
		hs.checkECG();
	}
	else {
		System.out.println("NO, it is not pointing at HeartSurgeon");
	}
	
	//doctorRef.diagnose();
	//doctorRef.doSurgery();
	//doctorRef.checkECG();
	
	/*
	surgeonRef.diagnose();
	surgeonRef.doSurgery();
	surgeonRef.checkECG();
		
	heartSurgeonRef.diagnose();
	heartSurgeonRef.doSurgery();
	heartSurgeonRef.checkECG();*/
		
		
		
		
		
		
		
		
	//	doctorRef.diagnose();
	//	doctorRef.doSurgery();
		
	//	MedicalCamp.medicalCheckup(heartSurgeonRef);
	//	OperationTheatre.doingOpenHeartSurgery(heartSurgeonRef);
	}

}

class OperationTheatre {
	static void doingOpenHeartSurgery(HeartSurgeon hs) {
		System.out.println("OT is having an open heart surgery..."+hs.getClass());
		hs.diagnose();
		//hs.doSurgery();
		
	}
}

class MedicalCamp
{
	static void medicalCheckup(Doctor doctRef)
	{
		System.out.println("Doing medical Checkup.."+doctRef.getClass());
		doctRef.diagnose();
		
	}
	
}



class Doctor {
	void diagnose() {
		System.out.println("Doctor:diagnose()");
	}
}
class Surgeon extends Doctor {
	void diagnose() {
		System.out.println("Surgeon:diagnose()");
	}
	private void cut() {
		System.out.println("cutting...");
	}
	private void stitching() {
		System.out.println("stitching....");
	}
	void doSurgery() {
		
		System.out.println("doing Surgery...");		
	}
	
	
}
class HeartSurgeon extends Surgeon {
	void diagnose() {
		System.out.println("HeartSurgeon:diagnose()");
	}
	
	void doSurgery() {
		
		System.out.println("doing Heart Surgery...");		
	}
	
	void checkECG() {
		System.out.println("Checking ECG");
	}
}
