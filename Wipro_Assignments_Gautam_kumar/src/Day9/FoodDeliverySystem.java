package Day9;
import java.util.concurrent.*;
import java.util.*;

class Order implements Runnable {
    private int orderId;

    public Order(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public void run() {
        System.out.println("Order " + orderId + " is being processed by " 
                + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // simulate delivery time
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Order " + orderId + " delivered by " 
                + Thread.currentThread().getName());
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of orders: ");
        int orders = sc.nextInt();

        System.out.print("Enter number of delivery agents: ");
        int agents = sc.nextInt();

        ExecutorService pool = Executors.newFixedThreadPool(agents);

        for (int i = 1; i <= orders; i++) {
            pool.execute(new Order(i));
        }

        pool.shutdown();
        sc.close();
    }
}