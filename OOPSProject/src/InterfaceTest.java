
public class InterfaceTest {

	public static void main(String[] args) {
		
		Person person = new Person('M',22,"Jack");

		person.proAct();
		
		Human human = person; // new Person('F',25,"Seema");
		
		human.proAct();
		
		Proactive pro = person; // new Person('F',25,"Reeta");
		
		pro.proAct();
	}

}
/*
 
  				Human			Machine
  				|proAct();		|proAct();
  				|				|
  				|    Proactive	|
  				|    |     |	|
  				|	 |	   |	|
  				Person	 CardMachine
  			 proAct(){}		proAct(){}
  
 */

interface Proactive // <-- Kashish
{
	void proAct();  //high level awareness
}

class Human { //Prakhar 
	
	public void proAct()  // within the scope of Human species
	{ 
		System.out.println("Human is proactive...");
	}
	
	void thinking() {
		System.out.println("Human is thinking....");
	}
}
//The type Person must implement the inherited abstract 
//method Proactive.proAct()

//The inherited method Human.proAct() cannot hide the public abstract method in Proactive


//Harsh

abstract class Machine {
	void proAct() {
		
	}
}

class CardMachine extends Machine implements Proactive {

	public void proAct() {
		System.out.println("without PIN debiting the amt....");
	}
}
//The inherited method Human.proAct() cannot hide the 
//public abstract method in Proactive

//Anand - developer
class Person extends Human implements Proactive
{
	char gender;
	int age;
	String name;
	
	public Person(char gender, int age, String name) {
		super();
		this.gender = gender;
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [gender=" + gender + ", age=" + age + ", name=" + name + "]";
	}

	@Override
	public void proAct() {
		System.out.println(name+" Person is proacting...");
		
	}


	
}

interface Graphics { // Chahat 
	void flip(); //h/w level acceleration awareness
}

interface GraphicalDevice extends Graphics{ //Prakhar <-- GUI Frame in Browser
	void flip(); // gui level acceleration awareness
}

//Madhav
class PlayingCard implements  GraphicalDevice {

	@Override
	public void flip() {
		// TODO Auto-generated method stub
		
	}
	
}


