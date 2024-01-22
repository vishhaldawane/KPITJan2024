import java.sql.*;
import java.util.Scanner;

public class DeleteTest {
	public static void main(String[] args) {

		//1. load the driver (ctrl+shift+M)
		
		try {
			
			//for hsqldb
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("HSQL Driver is registerd...");
			
			
			//for myhsqldb
			Connection conn2 = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb","SA","");
			System.out.println("Connected to the HSQL : "+conn2);
			//DEFAULT CONNECTION IS IN AUTOCOMMIT MODE
			
			conn2.setAutoCommit(false);
			System.out.println("Now Transactios are not auto commited..");
			System.out.println("We have to control the transactions...");
			System.out.println("Either via commit or rollback...");
			
			Statement st = conn2.createStatement();
			//ur table is mydept
			
			
			System.out.println("Which department number to delete ? ");
			Scanner scanner1 = new Scanner(System.in);
			int deptNumber=scanner1.nextInt(); //80
			
			
			//BMP   VS CMP
			PreparedStatement pst = conn2.prepareStatement("DELETE FROM DEPT10 WHERE DEPTNO=?");
			System.out.println("Prepared The statement");
			pst.setInt(1, deptNumber); //fillup the first ? placeholder

			int rows = pst.executeUpdate();
			
			System.out.println("Are you sure to delete ? ");
			Scanner scanner2 = new Scanner(System.in);
			String reply=scanner2.nextLine(); //Y Yes Yeap
			
			if(reply.equalsIgnoreCase("Yes")) {
				conn2.commit();
				System.out.println("Query executed...");
				System.out.println("Rows DELETED : "+rows);
				
			}
			else {
				conn2.rollback();
				System.out.println("Query discarded...");
				System.out.println("Rows Not Deleted : ");
				
			}
			
			
			pst.close();
			conn2.close();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


