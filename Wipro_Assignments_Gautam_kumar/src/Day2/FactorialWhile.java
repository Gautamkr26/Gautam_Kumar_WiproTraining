package Day2;

import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int i = 1;
        long factorial = 1;

        while (i <= num) {
            factorial = factorial * i;
            i++;
        }

        System.out.println("Factorial = " + factorial);

        sc.close();
    }
}