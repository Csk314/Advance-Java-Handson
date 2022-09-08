package Demo06JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoMySQLJDBC04 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb1", "root", "maveric1@321");
			if (conn != null) {
				System.out.println("Connected");
				conn.setAutoCommit(false);
				Statement stmt = conn.createStatement();
				stmt.addBatch("Insert into student values (11,'aerawe','k','Bangalore','sadasdvsd')");
				stmt.addBatch("Insert into student values (12,'aersfwawe','wefk','Bangalore','scewf')");
				stmt.addBatch("Insert into student values (13,'asdwe','fek','Bangalore','wef')");
				stmt.executeBatch();

				conn.commit();

				// conn.rollback(); // to rollback
			}
		} catch (Exception e) {
			// conn.rollback();
			System.out.println(e);
		} finally {
			conn.close();
		}
	}
}
