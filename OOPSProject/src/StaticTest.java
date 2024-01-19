
public class StaticTest {

	public static void main(String[] args) {

		Circle1 circ1 = new Circle1(50);
		circ1.calculateArea();
		circ1.calculatePeriphery();

		Circle1 circ2 = new Circle1(60);
		circ2.calculateArea();
		circ2.calculatePeriphery();

	}

}

class Car
{
	final String numberPlate;
	
	Car(String np) {
		numberPlate = np;
	}
	void setNumberPlate(String np) {
	//	numberPlate = np;
	}
}

class Circle1 // extends Object
{
	int radius;
	static final float PI = 3.14f;

	public Circle1(int radius) {
		//super();
		this.radius = radius;
	}
	
	void calculateArea() {
		float area = PI * radius * radius;
		System.out.println("Area of Circle : "+area);
	}
	void calculatePeriphery() {
		float perimeter = 2 * PI * radius;
		System.out.println("Perimeter of Circle : "+perimeter);
	}
	
	
	
}