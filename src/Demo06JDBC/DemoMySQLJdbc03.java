package Demo06JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*Insert into table using prepared statement
 * and Select using Prepard Statement
 * */
public class DemoMySQLJdbc03 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb1", "root", "maveric1@321");
			if (conn != null) {
				System.out.println("Connected");

//				PreparedStatement ps = conn.prepareStatement("INSERT INTO student values (?,?,?,?,?)");
//
//				// (8,'KING','k','Bangalore','XjUI')
//				ps.setInt(1, 9);
//				ps.setString(2, "Master");
//				ps.setString(3, "Y");
//				ps.setString(4, "Bangalore");
//				ps.setString(5, "asdad");
//				ps.executeUpdate();

				PreparedStatement ps2 = conn.prepareStatement("Select * from student where rollno=?");
				ps2.setInt(1, 9);

				ResultSet res = ps2.executeQuery();
				while (res.next()) {
					System.out.println(res.getInt(1));
					System.out.println(res.getString(2));
					System.out.println(res.getString(3));
					System.out.println(res.getString(4));
					System.out.println(res.getString(5));
				}

			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			conn.close();
		}
	}
}
