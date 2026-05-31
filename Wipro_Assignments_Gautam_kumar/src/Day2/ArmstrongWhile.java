package Day2;

import java.util.Scanner;

public class ArmstrongWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        int digits = 0;
        int temp = num;

        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;

            int i = 0;
            while (i < digits) {
                power = power * digit;
                i++;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}