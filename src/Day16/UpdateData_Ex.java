package Day16;

import java.sql.*;

public class UpdateData_Ex {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/wipro_db",
					"root",
					"Gautamkr@26");

			Statement st = con.createStatement();

			String query = "update employees set salary=40000 where emp_id=5";

			int rows = st.executeUpdate(query);

			System.out.println(rows + " row updated successfully");

			con.close();

		} catch (Exception e) {

			System.out.println(e);
		}
	}
}