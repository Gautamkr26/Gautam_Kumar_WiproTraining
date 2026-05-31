package Day2;

import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- Food Menu ----");
        System.out.println("1 → Pizza");
        System.out.println("2 → Burger");
        System.out.println("3 → Pasta");
        System.out.println("4 → Sandwich");
        System.out.println("5 → Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Item: Pizza | Price: ₹200");
                break;

            case 2:
                System.out.println("Item: Burger | Price: ₹120");
                break;

            case 3:
                System.out.println("Item: Pasta | Price: ₹150");
                break;

            case 4:
                System.out.println("Item: Sandwich | Price: ₹100");
                break;

            case 5:
                System.out.println("Thank you!");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}