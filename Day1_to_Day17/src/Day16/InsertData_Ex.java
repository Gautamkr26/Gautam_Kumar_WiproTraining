package Day16;

import java.sql.*;

public class InsertData_Ex {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/wipro_db",
					"root",
					"Gautamkr@26");

			Statement st = con.createStatement();

			String query = "insert into employees values(5,'Deva',105,30000)";

			int rows = st.executeUpdate(query);

			System.out.println(rows + " row inserted successfully");

			con.close();

		} catch (Exception e) {

			System.out.println(e);
		}
	}
}