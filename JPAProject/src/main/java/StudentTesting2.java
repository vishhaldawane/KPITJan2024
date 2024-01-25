import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentTesting2 {
	public static void main(String[] args) {
		
		
		
		Student student = new Student();
		System.out.println("Student created...");

		//student.setRollNumber(102);
		student.setStudentName("Jane");
		student.setAddress("Mumbai");
		System.out.println("Student filled up...");
		
		StudentDAO stuDAO = new StudentDAOImpl();
		stuDAO.createStudent(student);
		//..
		//..
		
		System.out.println("End of main");
	}
}

