package Day17;

import java.sql.*;

public class CRUDOperations {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/practice_day17",
			"root",
			"Gautamkr@26");

			Statement st = con.createStatement();

			// CREATE
			st.executeUpdate(
			"insert into employees values(6,'Rohit','Sales',50000)");

			System.out.println("Record Inserted");

			// READ
			ResultSet rs = st.executeQuery(
			"select * from employees");

			while(rs.next()) {

				System.out.println(
				rs.getInt(1) + " " +
				rs.getString(2) + " " +
				rs.getString(3) + " " +
				rs.getInt(4));
			}

			// UPDATE
			st.executeUpdate(
			"update employees set salary=65000 where emp_id=6");

			System.out.println("Record Updated");

			// DELETE
			st.executeUpdate(
			"delete from employees where emp_id=6");

			System.out.println("Record Deleted");

			con.close();

		} catch(Exception e) {

			System.out.println(e);
		}
	}
}