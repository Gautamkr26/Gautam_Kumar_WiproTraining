package Day17;

import java.sql.*;

public class DepartmentWiseEmployees {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/practice_day17",
			"root",
			"Gautamkr@26");

			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery(
			"select * from employees order by department");

			while(rs.next()) {

				System.out.println(
				rs.getInt(1) + " " +
				rs.getString(2) + " " +
				rs.getString(3) + " " +
				rs.getInt(4));
			}

			con.close();

		} catch(Exception e) {

			System.out.println(e);
		}
	}
}