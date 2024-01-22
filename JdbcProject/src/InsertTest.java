import java.sql.*;
import java.util.Scanner;

public class InsertTest {
	public static void main(String[] args) {

		//1. load the driver (ctrl+shift+M)
		
		try {
			
			//for hsqldb
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("HSQL Driver is registerd...");
			
			
			//for myhsqldb
			Connection conn2 = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb","SA","");
			System.out.println("Connected to the HSQL : "+conn2);
			
			Statement st = conn2.createStatement();
			//ur table is mydept
			
			System.out.println("Enter new department number : ");
			Scanner scanner1 = new Scanner(System.in);
			int deptNumber=scanner1.nextInt();
			
			
			System.out.println("Enter new department location : ");
			Scanner scanner2 = new Scanner(System.in);
			String deptLoc=scanner2.nextLine();
			
			System.out.println("Enter new department name : ");
			Scanner scanner3 = new Scanner(System.in);
			String deptName=scanner3.nextLine();
			
			
			PreparedStatement pst = conn2.prepareStatement("INSERT INTO DEPT10 VALUES (?,?,?)");
			System.out.println("Prepared The statement");
			pst.setInt(1, deptNumber); //fillup the first ? placeholder
			pst.setString(2, deptLoc); //fill up the second ?
			pst.setString(3, deptName); //fill up the third ?
	
			int rows = pst.executeUpdate();
			System.out.println("Query executed...");
			System.out.println("Rows inserted : "+rows);
			
			pst.close();
			conn2.close();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


