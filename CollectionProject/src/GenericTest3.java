
public class GenericTest3 {
	public static void main(String[] args) {
//AnyPair is a raw type. References to generic type AnyPair<T> 
		//should be parameterized
		
		AnyPair<Integer> intPair = new AnyPair<Integer>(10, 20); //wrapper
		
		System.out.println("int pair "+intPair);
		intPair.swap();
		System.out.println("int pair "+intPair);
		
		System.out.println("------");
		
		AnyPair<Float> floatPair = new AnyPair<Float>(12.5f, 67.5f);
		System.out.println("float pair "+floatPair);
		floatPair.swap();
		System.out.println("float pair "+floatPair);
		
		AnyPair<String> stringPair = new AnyPair<String>("Tonny","Robbins");
		System.out.println("string pair "+stringPair);
		stringPair.swap();
		System.out.println("string pair "+stringPair);
		
		
	}
	
}

//Class is loading its own code based on the value of T at compile time
class AnyPair<T> //Generic Container replicated
{
	private T i; //Generic Data Type
	private T j;
	
	public AnyPair(T i, T j) {
		super();
		this.i = i;
		this.j = j;
	}
	
	@Override
	public String toString() {
		return "AnyPair [i=" + i + ", j=" + j + "]";
	}
	
	//Generic Algorithm
	public void swap() { //function called by value
		System.out.println("swapping...");
		T temp = i;
		i = j; 
		j = temp;
		System.out.println("swapped....");
	}
	
}


