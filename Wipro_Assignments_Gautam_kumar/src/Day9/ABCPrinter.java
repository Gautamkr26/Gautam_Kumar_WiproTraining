package Day9;
import java.util.*;

public class ABCPrinter {
    private int turn = 0; // 0 -> A, 1 -> B, 2 -> C
    private int n;

    public ABCPrinter(int n) {
        this.n = n;
    }

    public synchronized void printA() {
        for (int i = 0; i < n; i++) {
            while (turn != 0) {
                try { wait(); } catch (InterruptedException e) {}
            }
            System.out.print("A ");
            turn = 1;
            notifyAll();
        }
    }

    public synchronized void printB() {
        for (int i = 0; i < n; i++) {
            while (turn != 1) {
                try { wait(); } catch (InterruptedException e) {}
            }
            System.out.print("B ");
            turn = 2;
            notifyAll();
        }
    }

    public synchronized void printC() {
        for (int i = 0; i < n; i++) {
            while (turn != 2) {
                try { wait(); } catch (InterruptedException e) {}
            }
            System.out.print("C ");
            turn = 0;
            notifyAll();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of repetitions: ");
        int n = sc.nextInt();

        ABCPrinter obj = new ABCPrinter(n);

        Thread t1 = new Thread(() -> obj.printA());
        Thread t2 = new Thread(() -> obj.printB());
        Thread t3 = new Thread(() -> obj.printC());

        t1.start();
        t2.start();
        t3.start();

        sc.close();
    }
}