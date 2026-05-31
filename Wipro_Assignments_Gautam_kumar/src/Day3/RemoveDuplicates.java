package Day3;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Set<Integer> set = new LinkedHashSet<>();

        for(int i : arr) {
            set.add(i);
        }

        System.out.println("After removing duplicates:");
        for(int i : set) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}