package Demo06JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * Getting data from table and adding it to array List
 *
 * */
public class DemoMySQLJDBC05 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		List<Student> studentList = new ArrayList<Student>();
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb1", "root", "maveric1@321");
			if (conn != null) {
				System.out.println("Connected");
				Statement stmt = conn.createStatement();
				ResultSet res = stmt.executeQuery("Select * from Student limit 5");

				while (res.next()) {
					Student s1 = new Student();
					s1.setRollno(res.getInt(1));
					s1.setFirstName(res.getString(2));
					s1.setLastname(res.getString(3));
					s1.setAddress(res.getString(4));
					s1.setSchoolname(res.getString(5));
					studentList.add(s1);
				}
			}

			for (Student s : studentList) {
				System.out.println(s.getRollno() + " " + s.getFirstName() + " " + s.getLastname() + " " + s.getAddress()
						+ " " + s.getSchoolname());
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			conn.close();
		}
	}
}
