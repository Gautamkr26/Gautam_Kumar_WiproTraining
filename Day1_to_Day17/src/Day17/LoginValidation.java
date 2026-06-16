package Day17;

import java.sql.*;
import java.util.Scanner;

public class LoginValidation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/practice_day17",
			"root",
			"Gautamkr@26");

			System.out.println("Enter Username:");
			String username = sc.nextLine();

			System.out.println("Enter Password:");
			String password = sc.nextLine();

			PreparedStatement ps = con.prepareStatement(
			"select * from users where username=? and password=?");

			ps.setString(1, username);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if(rs.next()) {

				System.out.println("Login Successful");

			} else {

				System.out.println("Invalid Username or Password");
			}

			con.close();

		} catch(Exception e) {

			System.out.println(e);
		}
	}
}