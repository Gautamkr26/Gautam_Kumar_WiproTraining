package Day7;

import java.util.*;

public class SymmetricDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First set
        System.out.print("Enter size of first set: ");
        int n1 = sc.nextInt();
        HashSet<Integer> set1 = new HashSet<>();

        System.out.println("Enter elements of first set:");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }

        // Second set
        System.out.print("Enter size of second set: ");
        int n2 = sc.nextInt();
        HashSet<Integer> set2 = new HashSet<>();

        System.out.println("Enter elements of second set:");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }

        // Symmetric Difference logic
        HashSet<Integer> result = new HashSet<>(set1);
        result.addAll(set2); // union

        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        result.removeAll(intersection);

        // Output
        if (result.isEmpty()) {
            System.out.println("No symmetric difference");
        } else {
            System.out.println("Symmetric Difference: " + result);
        }

        sc.close();
    }
}