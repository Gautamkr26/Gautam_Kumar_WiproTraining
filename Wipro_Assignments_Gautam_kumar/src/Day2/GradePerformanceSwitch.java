package Day2;

import java.util.Scanner;

public class GradePerformanceSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter grade (A, B, C, D, F): ");
        char grade = sc.next().charAt(0);

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'b':
                System.out.println("Very Good");
                break;
            case 'C':
            case 'c':
                System.out.println("Good");
                break;
            case 'D':
            case 'd':
                System.out.println("Needs Improvement");
                break;
            case 'F':
            case 'f':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade");
        }

        sc.close();
    }
}