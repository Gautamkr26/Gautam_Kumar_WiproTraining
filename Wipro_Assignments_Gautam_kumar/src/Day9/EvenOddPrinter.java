package Day9;
import java.util.*;

public class EvenOddPrinter {
    private int num;
    private int max;

    public EvenOddPrinter(int start, int max) {
        this.num = start;
        this.max = max;
    }

    public synchronized void printOdd() {
        while (num <= max) {
            while (num % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            if (num <= max) {
                System.out.print(num + " ");
                num++;
                notifyAll();
            }
        }
    }

    public synchronized void printEven() {
        while (num <= max) {
            while (num % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            if (num <= max) {
                System.out.print(num + " ");
                num++;
                notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        EvenOddPrinter obj = new EvenOddPrinter(start, end);

        Thread oddThread = new Thread(() -> obj.printOdd());
        Thread evenThread = new Thread(() -> obj.printEven());

        oddThread.start();
        evenThread.start();

        sc.close();
    }
}