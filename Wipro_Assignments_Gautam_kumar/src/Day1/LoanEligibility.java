package Day1;

import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your monthly salary: ");
        double salary = sc.nextDouble();

        if (age >= 21 && salary >= 25000) {
            System.out.println("Eligible for loan");
        } else {
            System.out.println("Not eligible for loan");
        }

        sc.close();
    }
}