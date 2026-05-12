package Day7;
class Payment extends Thread {
    public void run() {
        System.out.println("Payment is being processed...");
        try { Thread.sleep(2000); } catch(Exception e) {}
        System.out.println("Payment successful");
    }
}

class Order extends Thread {
    public void run() {
        System.out.println("Order is being confirmed...");
        try { Thread.sleep(1500); } catch(Exception e) {}
        System.out.println("Order confirmed");
    }
}

class Notification extends Thread {
    public void run() {
        System.out.println("Sending notification...");
        try { Thread.sleep(1000); } catch(Exception e) {}
        System.out.println("Notification sent");
    }
}

public class Multis {
    public static void main(String[] args) throws Exception {

        Payment t1 = new Payment();
        Order t2 = new Order();
        Notification t3 = new Notification();

        t1.start();
        t1.join();   // wait till payment done

        t2.start();
        t2.join();   // wait till order confirmed

        t3.start();
    }
}