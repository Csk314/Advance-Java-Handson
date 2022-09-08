package Demo06JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Program to insert to table
//use executeUpdate();
public class DemoMySQLJDBC02 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb1", "root", "maveric1@321");
			if (conn != null) {
				System.out.println("Connected");

				Statement stmt = conn.createStatement();
				stmt.executeUpdate("INSERT INTO student values (8,'KING','k','Bangalore','XjUI')");

			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			conn.close();
		}
	}
}
