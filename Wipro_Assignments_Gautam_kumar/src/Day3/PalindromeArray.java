package Day3;

import java.util.*;

public class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isPalindrome = true;

        for(int i = 0; i < n / 2; i++) {
            if(arr[i] != arr[n - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
            System.out.println("Array is Palindrome");
        else
            System.out.println("Array is Not Palindrome");

        sc.close();
    }
}