package Day17;

import java.sql.*;

public class SearchEmployee {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/practice_day17",
			"root",
			"Gautamkr@26");

			CallableStatement cs = con.prepareCall(
			"{call SearchEmployee(?)}");

			cs.setInt(1, 1);

			ResultSet rs = cs.executeQuery();

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