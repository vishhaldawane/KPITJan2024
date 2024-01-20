//javac			vs			java
//compiler					JRE

public class ExceptionTest2 {

	public static void main(String[] args) {

		System.out.println("Begin Main");
		
		try
		{
			int num=100;
			System.out.println("num  : "+num);
			
			int deno=0;
			System.out.println("deno : "+deno);
			
			System.out.println("Trying to divide "+num+" by "+deno);
			
			int div = num / deno; //it would throw an exception 
						// at runtime : ArithmeticException
				// ArithmeticException ae = new ArithmeticException("/ by zero");
				//	throw ae;
			System.out.println("Division : "+div);
			
		}
		catch(ArithmeticException x) {
			System.out.println("some problem1 : "+x.getMessage()); // x would call toString() --> ClassName + message
		}
		catch(RuntimeException e) {
			System.out.println("some problem2 : "+e.getMessage()); // x would call toString() --> ClassName + message

		}
		catch(Exception e) {
			System.out.println("some problem3 : "+e.getMessage()); // x would call toString() --> ClassName + message

		}
		catch(Throwable e) {
			System.out.println("some problem4 : "+e.getMessage()); // x would call toString() --> ClassName + message

		}
		
		System.out.println("End Main");
		

	}

}
