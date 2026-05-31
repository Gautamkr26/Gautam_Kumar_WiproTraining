package Day9;

import java.util.*;

class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() +
                " deposited: " + amount + " | Balance: " + balance);
        notifyAll();
    }

    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            try {
                System.out.println(Thread.currentThread().getName() +
                        " waiting to withdraw: " + amount);
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName() +
                " withdrew: " + amount + " | Balance: " + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        int initial = sc.nextInt();

        BankAccount account = new BankAccount(initial);

        Thread t1 = new Thread(() -> account.deposit(500), "Thread-Deposit-1");
        Thread t2 = new Thread(() -> account.withdraw(700), "Thread-Withdraw-1");
        Thread t3 = new Thread(() -> account.withdraw(300), "Thread-Withdraw-2");
        Thread t4 = new Thread(() -> account.deposit(400), "Thread-Deposit-2");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        sc.close();
    }
}