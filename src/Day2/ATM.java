package Day2;

public class ATM {

	public static void main(String[] args) {
	
		int balance = 5000;
        int withdraw = 3000;

        if (withdraw <= balance) {
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Balance");
        }

	}

}
