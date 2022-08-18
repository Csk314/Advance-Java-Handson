package Demo06JDBC;

//1 Import java.sql*; package
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoMySQLJDBC {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// 2.Load and Register Driver
		Class.forName("com.mysql.jdbc.Driver");
		// Database details
		String dbURL = "jdbc:mysql://localhost:3306/testdb1";
		String User = "root";
		String password = "maveric1@321";
		// 3. Create Connection
		Connection conn = DriverManager.getConnection(dbURL, User, password);
		if (conn != null) {
			System.out.println("Connected");
		}

		// 4. Create a Statement
		String query = "select Rollno,Firstname from student";

		Statement st = conn.createStatement();

		// 5. Execute the Query
		ResultSet res = st.executeQuery(query);
		// 6. Process the results
		res.next(); // rs.next() will make the pointer point to the first row as initially it is
					// pointed to column name
		int EmployeeID = res.getInt(1);
		String First_Name = res.getString(2);

		System.out.println("EmployeeID :" + EmployeeID);
		System.out.println("First_Name :" + First_Name);
	}
}
