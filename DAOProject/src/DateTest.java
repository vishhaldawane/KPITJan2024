import java.time.LocalDate;

public class DateTest {
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		System.out.println("Todays date : "+today);
		
		LocalDate hireDate = LocalDate.of(2020, 5, 18);
		System.out.println("Employee hire date : "+hireDate);
		
		Employee emp = new Employee(); //POJO
		emp.setJoining(LocalDate.of(2018, 3, 25));
		System.out.println("Joining : "+emp.getJoining());
		
	}
}

class Employee
{
	LocalDate joining;

	public LocalDate getJoining() {
		return joining;
	}

	public void setJoining(LocalDate joining) {
		this.joining = joining;
	}
	
	
}
//POJI
// EmployeeDAO

//PojiImpl
//EployeeDAO




