package jungle.tree;

//child AND same pack
public class Gorilla extends Monkey {

	Monkey monRef = new Monkey();

	void gigling() {
		System.out.println("defaultA   : "+monRef.defaultA);
		System.out.println("privateB   : "+monRef.privateB);
		System.out.println("protectedC : "+monRef.protectedC);
		System.out.println("publicD    : "+monRef.publicD);
	}

	void hanging() { // utilize the super class data cause of extends keywords
		System.out.println("defaultA   : "+defaultA);
		System.out.println("privateB   : "+privateB);
		System.out.println("protectedC : "+protectedC);
		System.out.println("publicD    : "+publicD);		
	}
}
