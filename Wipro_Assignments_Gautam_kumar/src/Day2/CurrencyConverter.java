package Day2;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- Currency Converter ----");
        System.out.println("1 → INR to USD");
        System.out.println("2 → INR to EUR");
        System.out.println("3 → INR to GBP");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount in INR: ");
        double inr = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("USD: " + (inr * 0.012));
                break;

            case 2:
                System.out.println("EUR: " + (inr * 0.011));
                break;

            case 3:
                System.out.println("GBP: " + (inr * 0.0095));
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}