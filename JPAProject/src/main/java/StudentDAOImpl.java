import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import myexceptions.StudentAlreadyExistException;
import myexceptions.StudentNotFoundException;

public class StudentDAOImpl implements StudentDAO {

	EntityManager em ;
	
	StudentDAOImpl() {
		//create the EMF
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
				System.out.println("EntityManagerFactory created...");
				
				em = emf.createEntityManager();
				System.out.println("EntityManager created...");
				
	}
	
	public void createStudent(Student stu)  {
		
		EntityTransaction trans =  em.getTransaction();
		trans.begin();
			em.persist(stu);
		trans.commit();
	}

	public Student readStudent(int rollno) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> readStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateStudent(Student stu) {
		// TODO Auto-generated method stub

	}

	public void deleteStudent(int rollno) {
		// TODO Auto-generated method stub

	}

}
