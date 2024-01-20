package jungle.farm;

import jungle.cave.Tiger;

public class WhiteTiger extends Tiger {
	void hunt() {
		Tiger tigerRef;
		System.out.println("defaultA   : "+tigerRef.defaultA);
		System.out.println("privateB   : "+tigerRef.privateB);
		System.out.println("protectedC : "+tigerRef.protectedC);
		System.out.println("publicD    : "+tigerRef.publicD);
	
	}
	void jump() {
		
		System.out.println("defaultA   : "+defaultA);
		System.out.println("privateB   : "+privateB);
		System.out.println("protectedC : "+protectedC);
		System.out.println("publicD    : "+publicD);
	
	}
}
