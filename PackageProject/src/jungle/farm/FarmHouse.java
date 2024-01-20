package jungle.farm;
//The type jungle.cave.Tiger is not visible
import jungle.tree.Monkey;

//non-child AND diff-pack
public class FarmHouse {

	public static void main(String[] args) {
		
		Monkey monRef = new Monkey();
		//monRef.jumping();

		System.out.println("defaultA   : "+monRef.defaultA);
		System.out.println("privateB   : "+monRef.privateB);
		System.out.println("protectedC : "+monRef.protectedC);
		System.out.println("publicD    : "+monRef.publicD);
	
	}

}
