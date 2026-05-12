package Day17;

import java.sql.*;

public class UpdateSalary {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/practice_day17",
			"root",
			"Gautamkr@26");

			PreparedStatement ps = con.prepareStatement(
			"update employees set salary=? where emp_id=?");

			ps.setInt(1, 80000);
			ps.setInt(2, 1);

			int rows = ps.executeUpdate();

			System.out.println(rows + " Record Updated");

			con.close();

		} catch(Exception e) {

			System.out.println(e);
		}
	}
}