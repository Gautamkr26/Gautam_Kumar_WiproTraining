package Day5_banking;

class BankAcc {
    private final double account_no;
    private String name;

    public BankAcc(double account_no, String name) {
        this.account_no = account_no;
        this.name = name;
    }

    public void display() {
        System.out.println("Account No: " + account_no);
        System.out.println("Name: " + name);
    }
}

public class FinalVariableEg {
    public static void main(String args[]) {
        BankAcc acc1 = new BankAcc(2500094, "Gautam");
        acc1.display();
    }
}