import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOTest {
	public static void main(String[] args) {
		
		/*Department dept = new Department();
		dept.setDepartmentNumber(10); //u know that this 10 exists!!! yes 
		dept.setDepartmentLocation("New York"); //new values to be set
		dept.setDepartmentName("InfoTech");//new values to be set
		
		DepartmentDAO deptDAO = new DepartmentDAOImpl();
		
		deptDAO.updateDepartment(dept);*/
		
		/*
		 DepartmentDAO deptDAO = new DepartmentDAOImpl();
		
		Department deptObj = deptDAO.readDepartment(50);
		
		System.out.println("DEPTNO : "+deptObj.getDepartmentNumber());
		System.out.println("DNAME  : "+deptObj.getDepartmentName());
		System.out.println("DLOC   : "+deptObj.getDepartmentLocation());
		*/
		

		DepartmentDAO deptDAO = new DepartmentDAOImpl();
		
		List<Department> deptList = deptDAO.readDepartments();
		
		
		for(Department deptObj : deptList) {
			System.out.println("DEPTNO : "+deptObj.getDepartmentNumber());
			System.out.println("DNAME  : "+deptObj.getDepartmentName());
			System.out.println("DLOC   : "+deptObj.getDepartmentLocation());
			System.out.println("----------");
		}
	}
}





















