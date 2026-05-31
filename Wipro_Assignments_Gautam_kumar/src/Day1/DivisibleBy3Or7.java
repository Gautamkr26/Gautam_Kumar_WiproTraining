package Day1;

import java.util.Scanner;

public class DivisibleBy3Or7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 3 == 0 || num % 7 == 0) {
            System.out.println("Divisible by 3 or 7");
        } else {
            System.out.println("Not divisible by 3 or 7");
        }

        sc.close();
    }
}