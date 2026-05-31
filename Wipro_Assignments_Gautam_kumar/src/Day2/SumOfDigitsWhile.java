package Day2;

import java.util.Scanner;

public class SumOfDigitsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int temp = Math.abs(num);

        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}