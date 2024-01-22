package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Department;

//3. Poji Impl

public class DepartmentDAOImpl implements DepartmentDAO
{
	Connection conn2 ;

	public DepartmentDAOImpl() {
		System.out.println("DepartmentDAOImpl() ctor....");
		try {
			
			//for hsqldb
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("HSQL Driver is registerd...");
			
			
			//for myhsqldb
			conn2 = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb","SA","");
			System.out.println("Connected to the HSQL : "+conn2);
			
			
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	
	@Override
	public void createDepartment(Department deptObj) {

		try {
			PreparedStatement pst = conn2.prepareStatement("INSERT INTO DEPT10 VALUES (?,?,?)");
			System.out.println("Prepared The statement");
			pst.setInt(1, deptObj.getDepartmentNumber()); //fillup the first ? placeholder
			pst.setString(2, deptObj.getDepartmentLocation()); //fill up the second ?
			pst.setString(3, deptObj.getDepartmentName()); //fill up the third ?

			int rows = pst.executeUpdate();
			System.out.println("Query executed...");
			System.out.println("Rows inserted : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

	@Override
	public Department readDepartment(int deptNumber) {
		Department deptObj = null;
		 
		try {
			Statement st = conn2.createStatement();
			//ur table is mydept
			ResultSet rs = st.executeQuery("select * from dept10 where deptno="+deptNumber);		
			
			if(rs.next()) {
				deptObj = new Department(); //new object per loop cycle
				deptObj.setDepartmentNumber(rs.getInt(1));
				deptObj.setDepartmentLocation(rs.getString(2));
				deptObj.setDepartmentName(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deptObj;
	}

	@Override
	public List<Department> readDepartments() {

		List<Department> deptList = new ArrayList<Department>();
		 
		try {
			Statement st = conn2.createStatement();
			//ur table is mydept
			ResultSet rs = st.executeQuery("select * from dept10");		
			
			while(rs.next()) {
				Department deptObj = new Department(); //new object per loop cycle
				deptObj.setDepartmentNumber(rs.getInt(1));
				deptObj.setDepartmentLocation(rs.getString(2));
				deptObj.setDepartmentName(rs.getString(3));
				deptList.add(deptObj); //add the object to the list
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deptList;
	}

	@Override
	public void updateDepartment(Department deptObj) {
		
		try {
			PreparedStatement pst = conn2.prepareStatement("UPDATE DEPT10 SET LOC=?, DNAME=? WHERE DEPTNO=?");
			System.out.println("Prepared The statement");
			pst.setString(1, deptObj.getDepartmentLocation()); //fill up the second ?
			pst.setString(2, deptObj.getDepartmentName()); //fill up the third ?
			pst.setInt(3, deptObj.getDepartmentNumber()); //fillup the first ? placeholder

			int rows = pst.executeUpdate();
			System.out.println("Query executed...");
			System.out.println("Rows UPDATED : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteDepartment(int deptNumber) {

		try {
			PreparedStatement pst = conn2.prepareStatement("DELETE FROM DEPT10 WHERE DEPTNO=?");
			System.out.println("Prepared The statement");
			pst.setInt(1, deptNumber); //fillup the first ? placeholder

			int rows = pst.executeUpdate();
			System.out.println("Query executed...");
			System.out.println("Rows DELETED : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
}