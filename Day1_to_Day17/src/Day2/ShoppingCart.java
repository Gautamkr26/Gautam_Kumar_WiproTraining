package Day2;
import java.util.Scanner;
public class ShoppingCart {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int total = 0;
	        int price;

	        System.out.println("Enter item prices (enter 0 to finish):");

	        while(true) {

	            System.out.print("Price: ");
	            price = sc.nextInt();

	            if(price == 0) {
	                break;
	            }

	            if(price < 0) {
	                System.out.println("Invalid price! Try again.");
	                continue;
	            }

	            total += price;
	        }

	        System.out.println("----------------------");
	        System.out.println("Total Amount: " + total);
	        System.out.println("Thank you for shopping!");

	        sc.close();
    }
	}


