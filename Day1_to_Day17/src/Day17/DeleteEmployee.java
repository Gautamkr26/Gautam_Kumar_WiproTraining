package Day17;

import java.sql.*;

public class DeleteEmployee {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/practice_day17",
			"root",
			"Gautamkr@26");

			PreparedStatement ps = con.prepareStatement(
			"delete from employees where emp_id=?");

			ps.setInt(1, 5);

			int rows = ps.executeUpdate();

			System.out.println(rows + " Record Deleted");

			con.close();

		} catch(Exception e) {

			System.out.println(e);
		}
	}
}