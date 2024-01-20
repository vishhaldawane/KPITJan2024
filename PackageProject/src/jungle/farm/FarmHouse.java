package jungle.farm;
//The type jungle.cave.Tiger is not visible
import jungle.cave.Tiger;


public class FarmHouse {

	public static void main(String[] args) {
		
		Tiger tigerRef = new Tiger();
		tigerRef.printValues();

		System.out.println("defaultA   : "+tigerRef.defaultA);
		System.out.println("privateB   : "+tigerRef.privateB);
		System.out.println("protectedC : "+tigerRef.protectedC);
		System.out.println("publicD    : "+tigerRef.publicD);
	
	}

}
