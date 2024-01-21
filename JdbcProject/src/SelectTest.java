import java.sql.DriverManager;

public class SelectTest {
	public static void main(String[] args) {

		//1. load the driver (ctrl+shift+M)
		
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		System.out.println("Drivare is registerd...");
		
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root123");
		System.out.println("Connected to the db");
	}
}


