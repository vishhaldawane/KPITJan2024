
public class HasTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human theHuman = new Human();
		theHuman.thinking();
		theHuman.feeling();
		theHuman.sweetHeart.pumping();
		
	}

}
class Heart
{
	void pumping() {
		System.out.println("Pumping the blood..");
	}
}
class Lung {
	void inhale() {
		System.out.println("inhaling...");
	}
	void exhale() {
		System.out.println("exhaling....");
	}
}

class Human {
	
	Heart sweetHeart = new Heart(); //hasA
	
	Lung rightLung;
	Lung leftLung;
	
	Human() {
		System.out.println("Human ctor...");
		
		rightLung = new Lung();
		leftLung = new Lung();
		
		rightLung.inhale();
		leftLung.inhale();
		
		rightLung.exhale();
		leftLung.exhale();
		
	}
	
	void thinking() {
		System.out.println("Human is thinking...");
	}
	void feeling() {
		System.out.println("Human is feeling....");
	}
}
