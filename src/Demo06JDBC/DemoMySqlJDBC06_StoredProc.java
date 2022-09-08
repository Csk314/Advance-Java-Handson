package Demo06JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DemoMySqlJDBC06_StoredProc {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb1", "root", "maveric1@321");
			if (conn != null) {
				CallableStatement cstmt = conn.prepareCall("CALL GetStudentByID(?)");
				cstmt.setInt(1, 3);
				cstmt.execute();
				ResultSet res = cstmt.getResultSet();
				while (res.next()) {
					int Rollno = res.getInt(1);
					String First_Name = res.getString(2);
					String Address = res.getString("address");

					System.out.println(
							"Roll :" + Rollno + " " + "First_Name :" + First_Name + " " + "Address " + Address);

				}
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			conn.close();
		}
	}

}
