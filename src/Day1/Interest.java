package Day1;

public class Interest {

	public static void main(String[] args) {

		double p = 10000;
		double r = 5;
		double t = 2;

		double si = (p * r * t) / 100;

		System.out.println("Principal: " + p);
		System.out.println("Rate: " + r);
		System.out.println("Time: " + t);
		System.out.println("Simple Interest: " + si);
	}
}