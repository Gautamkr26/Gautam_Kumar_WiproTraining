package Day5_payment;

interface Payment {
    void pay(double amount);

    default void generateReceipt(double amount) {
        System.out.println("Receipt: Payment of Rs." + amount + " successful.");
    }

    static void paymentInfo() {
        System.out.println("Available Methods: Credit Card | Debit Card | UPI");
    }
}
