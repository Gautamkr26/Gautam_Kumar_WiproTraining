package Day11;
import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char result = 0;
        boolean found = false;

        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                result = ch;
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }

        sc.close();
    }
}