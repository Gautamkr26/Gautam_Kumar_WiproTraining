package Day12;

import java.sql.*;
import java.util.Scanner;

public class InsertStudent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/assignment_day12",
					"root",
					"Gautamkr@26");

			System.out.println("Enter ID:");
			int id = sc.nextInt();

			sc.nextLine();

			System.out.println("Enter Name:");
			String name = sc.nextLine();

			System.out.println("Enter Age:");
			int age = sc.nextInt();

			sc.nextLine();

			System.out.println("Enter Course:");
			String course = sc.nextLine();

			String query = "insert into students values(?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setString(4, course);

			int rows = ps.executeUpdate();

			System.out.println(rows + " row inserted successfully");

			con.close();

		} catch (Exception e) {

			System.out.println(e);
		}
	}
}