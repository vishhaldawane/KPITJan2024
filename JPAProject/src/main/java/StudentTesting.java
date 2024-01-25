import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentTesting {
	public static void main(String[] args) {
		
		
		//create the EMF
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory created...");
		
		EntityManager em = emf.createEntityManager();
		System.out.println("EntityManager created...");
		
		Student student = new Student();
		System.out.println("Student created...");

		student.setRollNumber(101);
		student.setStudentName("Jack");
		student.setAddress("Pune");
		System.out.println("Student filled up...");

		
		EntityTransaction trans = em.getTransaction();
		System.out.println("EntityTransaction created...");

		trans.begin();
		System.out.println("EntityTransaction started......");

				em.persist(student);
				System.out.println("student object persisted...");

		trans.commit();
		
		em.close();
		emf.close();
		
	}
}

