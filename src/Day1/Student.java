package Day1;

public class Student {

	public static void main(String[] args) {

		String name = "Gautam";
		int age = 23;
		float marks1 = 80;
		float marks2 = 75;
		float marks3 = 85;

		float average = (marks1 + marks2 + marks3) / 3;

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Marks1: " + marks1);
		System.out.println("Marks2: " + marks2);
		System.out.println("Marks3: " + marks3);
		System.out.println("Average Marks: " + average);
	}
}