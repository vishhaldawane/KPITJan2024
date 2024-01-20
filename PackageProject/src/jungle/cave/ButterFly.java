package jungle.cave;

public class ButterFly {
	void fly() {
		Tiger tigerRef = new Tiger();
		System.out.println("defaultA   : "+tigerRef.defaultA);
		System.out.println("privateB   : "+tigerRef.privateB);
		System.out.println("protectedC : "+tigerRef.protectedC);
		System.out.println("publicD    : "+tigerRef.publicD);
	
	}
}
