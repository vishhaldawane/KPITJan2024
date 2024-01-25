import java.io.FileInputStream;

public class Test {
	public static void main(String[] args) {
		
		
		int k=100/0; //Unhandled Exception of type ArithmeticException
		System.out.println("k"+k);
		
		FileInputStream fin = new FileInputStream("/Users/apple/a.txt");
		
		Employee emp = new Employee();
		emp.giveExam();
	}
}
class NegativeMarkingException extends Exception
{
	
}
class Employee
{
	void giveExam() throws NegativeMarkingException
	{
		
	}
}