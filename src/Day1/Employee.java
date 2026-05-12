package Day1;

public class Employee {
	
	public static void main(String[] args) {
		
		double basic = 20000;
		double bonus = 5000;
		double tax = 2000;
		
		double salary = basic + bonus - tax;
		
		System.out.println("Basic Salary: " + basic);
		System.out.println("Bonus: " + bonus);
		System.out.println("Tax: " + tax);
		System.out.println("Net Salary: " + salary);
	}
}