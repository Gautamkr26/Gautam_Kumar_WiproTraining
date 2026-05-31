package Day11;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Set<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                result.append(ch);
            }
        }

        System.out.println("String after removing duplicates: " + result);

        sc.close();
    }
}