//How will you use Serialization in Java to save and retrieve employee objects from files?

package Day12;

import java.io.*;

class Staff implements Serializable {

    int id;
    String name;
    double salary;

    Staff(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class EmployeeApp {

    public static void main(String[] args) {

        Staff emp = new Staff(1, "Aryan", 50000);

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream("emp.txt"));

            oos.writeObject(emp);

            oos.close();

            System.out.println("Employee Saved!");

        } catch (IOException e) {
            System.out.println(e);
        }

        try {

            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream("emp.txt"));

            Staff e = (Staff) ois.readObject();

            ois.close();

            System.out.println("Employee Retrieved:");

            e.display();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}