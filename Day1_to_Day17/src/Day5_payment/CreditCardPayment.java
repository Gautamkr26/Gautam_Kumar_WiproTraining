package Day5_payment;

class CreditCardPayment implements Payment {
    String cardNumber;
    int pin;

    CreditCardPayment(String cardNumber, int pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    public void pay(double amount) {
        System.out.println("Processing Credit Card...");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Paid Rs." + amount + " using Credit Card");
    }
}