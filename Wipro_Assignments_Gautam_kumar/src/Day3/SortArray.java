package Day3;

import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Ascending Order:");
        for(int i : arr) System.out.print(i + " ");

        System.out.println("\nDescending Order:");
        for(int i = n-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}