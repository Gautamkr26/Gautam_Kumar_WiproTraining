package Day12;
import java.sql.*;

public class MultipleInsert {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/assignment_day12",
					"root",
					"Gautamkr@26");

			Statement st = con.createStatement();

			st.executeUpdate("insert into students values(2,'Anand',22,'Python')");
			st.executeUpdate("insert into students values(3,'Aryan',21,'AI')");
			st.executeUpdate("insert into students values(4,'Dinesh',23,'ML')");

			System.out.println("Multiple records inserted successfully");

			con.close();

		} catch (Exception e) {

			System.out.println(e);
		}
	}
}