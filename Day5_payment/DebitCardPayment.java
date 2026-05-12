package Day5_payment;

class DebitCardPayment implements Payment {
    String cardNumber;
    int pin;

    DebitCardPayment(String cardNumber, int pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    public void pay(double amount) {
        System.out.println("Processing Debit Card...");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Paid Rs." + amount + " using Debit Card");
    }
}
