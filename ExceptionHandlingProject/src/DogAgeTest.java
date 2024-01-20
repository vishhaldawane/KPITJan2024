
public class DogAgeTest {

	public static void main(String[] args) {

		System.out.println("Begin");
		
		//if the ctor is failed, then the data allocated by new
		// keyword is rollbacked
		
		Dog d1 = new Dog("Tommy",10);
		System.out.println("d1 "+d1);
		
		System.out.println("End");
	}

}

class Dog
{
	String name;
	int age;
	
	public Dog(String name, int age) {
		System.out.println("-> Dog ctor started...");
		this.name = name;
		
		if(age > 14) {
			RuntimeException rte = new RuntimeException("Dog's age cannot be more than 14");
			throw rte;
		}
		else if(age <= 0) {
			RuntimeException rte = new RuntimeException("Dog's age cannot be zero or negative");
			throw rte;
		}
		else {
			this.age = age;
		}
		System.out.println("Dog ctor finished...<-");

	}
	

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
	
}
