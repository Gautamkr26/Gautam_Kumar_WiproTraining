package Day6;
import java.util.*;

public class BooleanWrapperDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter true or false: ");
        String input = sc.next();

        // convert String to Boolean using wrapper class
        Boolean b = Boolean.valueOf(input);

        System.out.println("Boolean value: " + b);

        // example usage
        if (b) {
            System.out.println("Condition is True");
        } else {
            System.out.println("Condition is False");
        }

        sc.close();
    }
}