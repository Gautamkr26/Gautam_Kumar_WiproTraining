package Day6;

import java.util.Scanner;

class InvalidPinException extends Exception {
    private static final long serialVersionUID = 1L;

    public InvalidPinException(String message) {
        super(message);
    }
}

public class ATM {

    static void checkPin(int pin) throws InvalidPinException {
        int correctPin = 1234;
        if (pin != correctPin) {
            throw new InvalidPinException("Invalid PIN entered");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert Card");
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        try {
            checkPin(pin);
            System.out.println("PIN verified successfully");
        } catch (InvalidPinException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Transaction logged");
        }

        sc.close();
    }
}