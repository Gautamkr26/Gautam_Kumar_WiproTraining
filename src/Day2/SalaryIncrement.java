package Day2;
import java.util.Scanner;

class SalaryIncrement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int salary[] = new int[n];

        System.out.println("Enter salaries:");
        for(int i = 0; i < n; i++) {
            salary[i] = sc.nextInt();
        }

        System.out.print("Enter increment amount: ");
        int increment = sc.nextInt();

        System.out.println("Updated Salaries:");

        for(int i = 0; i < n; i++) {
            int updated = salary[i] + increment;
            System.out.println("Employee " + (i+1) + ": " + updated);
        }

        sc.close();
    }
}