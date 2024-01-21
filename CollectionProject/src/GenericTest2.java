
public class GenericTest2 {
	public static void main(String[] args) {

		IntegerPair intPair = new IntegerPair(10, 20); //wrapper
		
		System.out.println("int pair "+intPair);
		intPair.swap();
		System.out.println("int pair "+intPair);
		
		System.out.println("------");
		
		FloatPair floatPair = new FloatPair(12.5f, 67.5f);
		System.out.println("float pair "+floatPair);
		floatPair.swap();
		System.out.println("float pair "+floatPair);
		
		StringPair stringPair = new StringPair("Tonny","Robbins");
		System.out.println("string pair "+stringPair);
		stringPair.swap();
		System.out.println("string pair "+stringPair);
		
		
	}
	
}

class IntegerPair //Container replicated
{
	private int i; //replicated
	private int j;
	
	public IntegerPair(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	
	@Override
	public String toString() {
		return "IntegerPair [i=" + i + ", j=" + j + "]";
	}
	
	//replicated
	public void swap() { //function called by value
		System.out.println("swapping...");
		int temp = i;
		i = j; //replicated
		j = temp;
		System.out.println("swapped....");
	}
	
}

class FloatPair // Y <-- Container
{
	// X
	float i; //Data Type - Content
	float j; //Content
	
	
	public FloatPair(float i, float j) {
		super();
		this.i = i;
		this.j = j;
	}
	
	@Override
	public String toString() {
		return "FloatPair [i=" + i + ", j=" + j + "]";
	}
	
	//Z Algorithm
	public void swap() { //function called by value
		System.out.println("swapping...");
		float temp = i;
		i = j; //I 
		j = temp; //I
		System.out.println("swapped....");
	}
	
}


class StringPair // Y <-- Container
{
	// X
	String i; //Data Type - Content
	String j; //Content
	
	
	public StringPair(String i, String j) {
		super();
		this.i = i;
		this.j = j;
	}
	
	@Override
	public String toString() {
		return "StringPair [i=" + i + ", j=" + j + "]";
	}
	
	//Z Algorithm
	public void swap() { //function called by value
		System.out.println("swapping...");
		String temp = i;
		i = j; //I 
		j = temp; //I
		System.out.println("swapped....");
	}
	
}
