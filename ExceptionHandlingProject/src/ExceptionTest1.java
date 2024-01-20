//javac			vs			java
//compiler					JRE

public class ExceptionTest1 {

	public static void main(String[] args) {

		System.out.println("Begin Main");
		
		int num=100;
		System.out.println("num  : "+num);
		
		int deno=0;
		System.out.println("deno : "+deno);
		
		System.out.println("Trying to divide "+num+" by "+deno);
		
		if(deno != 0) {
			int div = num / deno; //it would throw an exception 
					// at runtime : ArithmeticException
			// ArithmeticException ae = new ArithmeticException("/ by zero");
			//	throw ae;
			System.out.println("Division : "+div);
		}
		else {
			System.out.println("Cannot divide by zero");
		}
		System.out.println("End Main");
		

	}

}
