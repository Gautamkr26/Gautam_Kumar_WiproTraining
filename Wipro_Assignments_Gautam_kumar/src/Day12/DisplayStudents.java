package Day12;

import java.sql.*;

public class DisplayStudents {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/assignment_day12",
					"root",
					"Gautamkr@26");

			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery("select * from students");

			while(rs.next()) {

				System.out.println(
						rs.getInt(1) + " " +
						rs.getString(2) + " " +
						rs.getInt(3) + " " +
						rs.getString(4));
			}

			con.close();

		} catch (Exception e) {

			System.out.println(e);
		}
	}
}