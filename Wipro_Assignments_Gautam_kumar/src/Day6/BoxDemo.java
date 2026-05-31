package Day6;

import java.util.*;

class Box {
    int length;
}

public class BoxDemo {

    public static void modify(Box b) {
        b.length = b.length + 10;
        System.out.println("Inside method: " + b.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Box obj = new Box();

        System.out.print("Enter length: ");
        obj.length = sc.nextInt();

        System.out.println("Before method call: " + obj.length);

        modify(obj);

        System.out.println("After method call: " + obj.length);

        sc.close();
    }
}