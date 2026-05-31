package Day8;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> productPrice = new HashMap<>();
        productPrice.put("laptop", 50000);
        productPrice.put("phone", 20000);
        productPrice.put("headphones", 2000);

        List<String> cart = new ArrayList<>();

        System.out.println("Available Products: " + productPrice.keySet());
        System.out.print("Enter number of items to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter product name: ");
            String item = sc.nextLine().toLowerCase();

            if (productPrice.containsKey(item)) {
                cart.add(item);
            } else {
                System.out.println("Product not found!");
                i--; // retry same iteration
            }
        }

        int total = 0;
        for (String item : cart) {
            total += productPrice.get(item);
        }

        System.out.println("Cart Items: " + cart);
        System.out.println("Total Price: ₹" + total);

        sc.close();
    }
}