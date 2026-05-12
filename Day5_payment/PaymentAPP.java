package Day5_payment;

import java.util.Scanner;

public class PaymentAPP {
  public static void main(String[] args) {

      try (Scanner sc = new Scanner(System.in)) {

          Payment.paymentInfo();

          System.out.println("\nChoose Payment Method:");
          System.out.println("1. Credit Card");
          System.out.println("2. Debit Card");
          System.out.println("3. UPI");

          int choice = sc.nextInt();

          System.out.print("Enter Amount: ");
          double amount = sc.nextDouble();

          Payment p = null;

          if (choice == 1) {
              System.out.print("Enter Card Number: ");
              String card = sc.next();
              System.out.print("Enter PIN: ");
              int pin = sc.nextInt();

              p = new CreditCardPayment(card, pin);

          } else if (choice == 2) {
              System.out.print("Enter Card Number: ");
              String card = sc.next();
              System.out.print("Enter PIN: ");
              int pin = sc.nextInt();

              p = new DebitCardPayment(card, pin);

          } else if (choice == 3) {
              System.out.print("Enter UPI ID: ");
              String upi = sc.next();
              System.out.print("Enter PIN: ");
              int pin = sc.nextInt();

              p = new UpiPayment(upi, pin);

          } else {
              System.out.println("Invalid Choice!");
          }

          if (p != null) {
              p.pay(amount);
              p.generateReceipt(amount);
          }
      }
  }
}
