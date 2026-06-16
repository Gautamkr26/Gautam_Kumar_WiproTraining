package Day3;

public class Employeenew {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);

        acc.deposit(500);
        acc.withdraw(300);

        System.out.println("Final Balance: " + acc.getBalance());
    }
}