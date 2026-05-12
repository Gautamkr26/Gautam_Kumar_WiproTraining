package Day17;

import java.sql.*;

public class InsertEmployees {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/practice_day17",
			"root",
			"Gautamkr@26");

			String query = "insert into employees values(?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, 1);
			ps.setString(2, "Gautam");
			ps.setString(3, "IT");
			ps.setInt(4, 60000);
			ps.executeUpdate();

			ps.setInt(1, 2);
			ps.setString(2, "Anand");
			ps.setString(3, "HR");
			ps.setInt(4, 45000);
			ps.executeUpdate();

			ps.setInt(1, 3);
			ps.setString(2, "Aryan");
			ps.setString(3, "Finance");
			ps.setInt(4, 70000);
			ps.executeUpdate();

			ps.setInt(1, 4);
			ps.setString(2, "Dinesh");
			ps.setString(3, "IT");
			ps.setInt(4, 55000);
			ps.executeUpdate();

			ps.setInt(1, 5);
			ps.setString(2, "Rahul");
			ps.setString(3, "Marketing");
			ps.setInt(4, 40000);
			ps.executeUpdate();

			System.out.println("5 Records Inserted Successfully");

			con.close();

		} catch(Exception e) {

			System.out.println(e);
		}
	}
}