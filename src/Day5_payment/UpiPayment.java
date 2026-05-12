package Day5_payment;

class UpiPayment implements Payment {
  String upiId;
  int pin;

  UpiPayment(String upiId, int pin) {
      this.upiId = upiId;
      this.pin = pin;
  }

  public void pay(double amount) {
      System.out.println("Processing UPI...");
      System.out.println("UPI ID: " + upiId);
      System.out.println("Paid Rs." + amount + " using UPI");
  }
}