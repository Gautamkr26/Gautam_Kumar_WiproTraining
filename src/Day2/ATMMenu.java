package Day2;
import java.util.Scanner;
public class ATMMenu {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int choice;
	        int balance = 10000;

	        do {
	            System.out.println("\n--- ATM MENU ---");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            choice = sc.nextInt();

	            if(choice == 1) {
	                System.out.println("Balance: " + balance);
	            }
	            else if(choice == 2) {
	                System.out.print("Enter amount to deposit: ");
	                int amount = sc.nextInt();
	                balance = balance + amount;
	                System.out.println("Updated Balance: " + balance);
	            }
	            else if(choice == 3) {
	                System.out.print("Enter amount to withdraw: ");
	                int amount = sc.nextInt();

	                if(amount <= balance) {
	                    balance = balance - amount;
	                    System.out.println("Withdrawal Successful");
	                    System.out.println("Remaining Balance: " + balance);
	                } else {
	                    System.out.println("Insufficient Balance");
	                }
	            }

	        } while(choice != 4);

	        System.out.println("Thank you for using ATM!");

	        sc.close();
	    }
	}