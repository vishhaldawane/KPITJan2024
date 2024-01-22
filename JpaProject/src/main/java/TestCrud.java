import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestCrud {
	public static void main(String[] args) {
		
		
		Department dept =null;
		
	//	dept.setDepartmentNumber(80);
		//dept.setDepartmentName("KPIT");
		//dept.setDepartmentLocation("Pune");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is loaded and key MyJPA is found with 7 keys and values
		System.out.println("EMF loaded");
		
		EntityManager manager = factory.createEntityManager(); //Entity = pojo with PK = 
		System.out.println("EM loaded");
		
		EntityTransaction trans = manager.getTransaction();
		System.out.println("Transaction started ");
		
		trans.begin();
			dept = manager.find(Department.class, 80);
				
			manager.remove(dept);
		trans.commit();
		System.out.println("committed ");
		
		
		
	}
}
