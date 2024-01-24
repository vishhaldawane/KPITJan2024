import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entity.Employee;

public class EmployeeTesting {


	EntityManager manager;
	
	EmployeeTesting() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyJPA");
		manager = factory.createEntityManager();
		System.out.println("manager created : "+manager);
	}
	
	@Test
	public void createEmployeeTest() {
		System.out.println("Trying to insert an employee");
		EntityTransaction trans = manager.getTransaction();
		trans.begin();
			Employee emp= new Employee();
			emp.setEmployeeNumber(5678);
			emp.setEmployeeName("Jackie");
			emp.setEmployeeSalary(6000);
			manager.persist(emp);
		trans.commit();
		System.out.println("Object persisted...");
	}
	
	@Test
	public void selectEmployeeTest() {
		System.out.println("Trying to find an employee");
			Employee emp= manager.find(Employee.class, 5678);
			Assertions.assertTrue(emp!=null);
			System.out.println("EMPNO : "+emp.getEmployeeNumber());
			System.out.println("NAME  : "+emp.getEmployeeName());
			System.out.println("SAL   : "+emp.getEmployeeSalary());
			
		System.out.println("Object retrieved...");
	}

	@Test
	public void selectAllEmployeesTest() {
		System.out.println("Trying to find all employee");
			Query query = manager.createQuery("from Employee"); //JPQL
			Assertions.assertTrue(query!=null);
			
			List<Employee> staff = query.getResultList();
			
			for(Employee emp : staff) {
				System.out.println("EMPNO : "+emp.getEmployeeNumber());
				System.out.println("NAME  : "+emp.getEmployeeName());
				System.out.println("SAL   : "+emp.getEmployeeSalary());
			}
		System.out.println("Object retrieved...");
	}
	
	@Test
	public void updateEmployeeTest() {
		System.out.println("Trying to update an employee");
		EntityTransaction trans = manager.getTransaction();
		trans.begin();
								//SELECT
			Employee emp= manager.find(Employee.class, 7839);
			Assertions.assertTrue(emp!=null);
			emp.setEmployeeName("JULIE"); //on object found: change its name as JULIE
			emp.setEmployeeSalary(9990); //on object found": change the salary as 9990
			manager.merge(emp); //UPDATE QUERY : this query would change the state of that object in the DB
		trans.commit();
		System.out.println("Object modified...");
	}

	@Test
	public void deleteEmployeeTest() {
		System.out.println("Trying to delete an employee");
									EntityTransaction trans = manager.getTransaction();
		trans.begin();
								//SELECT
			Employee emp= manager.find(Employee.class, 5678);
		
			
			
			
			Assertions.assertTrue(emp!=null);
			manager.remove(emp); //UPDATE QUERY : this query would change the state of that object in the DB
																				trans.commit();
		System.out.println("Object removed...");
	}

}
