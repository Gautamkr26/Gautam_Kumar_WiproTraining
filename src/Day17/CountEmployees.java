package Day17;

import java.sql.*;

public class CountEmployees {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/practice_day17",
			"root",
			"Gautamkr@26");

			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery(
			"select count(*) from employees");

			if(rs.next()) {

				System.out.println(
				"Total Employees: " + rs.getInt(1));
			}

			con.close();

		} catch(Exception e) {

			System.out.println(e);
		}
	}
}