package Day6;

import java.util.*;

public class ValueChangeDemo {

    public static void changeValue(int num) {
        num = num + 10;
        System.out.println("Value inside method: " + num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int x = sc.nextInt();

        System.out.println("Before method call: " + x);

        changeValue(x);

        System.out.println("After method call: " + x);

        sc.close();
    }
}