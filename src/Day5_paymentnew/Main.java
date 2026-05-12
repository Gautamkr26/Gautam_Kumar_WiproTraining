package Day5_paymentnew;

class LoginSystem {
    public final void authenticateUser() {
        System.out.println("User authenticated with correct password");
    }
}

class Admin extends LoginSystem {
    public void adminAccess() {
        System.out.println("Admin access granted");
    }

}

public class Main {
    public static void main(String args[]) {
        LoginSystem user1 = new LoginSystem();
        user1.authenticateUser();

        Admin user2 = new Admin();
        user2.adminAccess();
        user2.authenticateUser(); // inherited method
    }
}