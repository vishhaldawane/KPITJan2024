package jungle.tree;

//non-child AND same pack
public class Chimp {

	Monkey monRef = new Monkey();

	void gigling() {
		System.out.println("defaultA   : "+monRef.defaultA);
		System.out.println("privateB   : "+monRef.privateB);
		System.out.println("protectedC : "+monRef.protectedC);
		System.out.println("publicD    : "+monRef.publicD);
	
	}
}
