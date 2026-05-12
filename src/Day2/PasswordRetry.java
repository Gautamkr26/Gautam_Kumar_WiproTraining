package Day2;
import java.util.Scanner;


public class PasswordRetry {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String correctPassword = "1234";
	        int attempts = 3;

	        while(attempts > 0) {

	            System.out.print("Enter Password: ");
	            String input = sc.nextLine();

	            if(input.equals(correctPassword)) {
	                System.out.println("Login Successful");
	                break;
	            } 
	            else {
	                attempts--;
	                System.out.println("Wrong Password. Attempts left: " + attempts);
	            }
	        }

	        if(attempts == 0) {
	            System.out.println("Account Locked");
	        }

	        sc.close();
	    }
	}




