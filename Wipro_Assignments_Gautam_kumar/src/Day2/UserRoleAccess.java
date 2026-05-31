package Day2;

import java.util.Scanner;

public class UserRoleAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter role (Admin/User/Guest): ");
        String role = sc.next();

        switch (role.toLowerCase()) {
            case "admin":
                System.out.println("Access: Full access");
                break;

            case "user":
                System.out.println("Access: Limited access");
                break;

            case "guest":
                System.out.println("Access: View only");
                break;

            default:
                System.out.println("Invalid role");
        }

        sc.close();
    }
}