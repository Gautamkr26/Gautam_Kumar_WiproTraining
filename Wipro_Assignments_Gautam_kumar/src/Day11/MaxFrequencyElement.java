package Day11;

import java.util.*;

public class MaxFrequencyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxElement = arr[0];
        int maxFreq = 0;

        // Find max frequency
        for (int key : map.keySet()) {
            if (map.get(key) > maxFreq) {
                maxFreq = map.get(key);
                maxElement = key;
            }
        }

        System.out.println("Element with maximum frequency: " + maxElement);
        System.out.println("Frequency: " + maxFreq);

        sc.close();
    }
}