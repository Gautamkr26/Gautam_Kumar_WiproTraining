package Day6;

import java.util.*;

public class ValueOfDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // convert int to String using valueOf
        String str = String.valueOf(num);

        System.out.println("Converted to String: " + str);

        sc.close();
    }
}