package Day12;
import java.io.*;

class Employee implements Serializable {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {

        try {
            Employee e1 = new Employee(101, "Gautam");

            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream("data.ser"));

            out.writeObject(e1);
            out.close();

            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream("data.ser"));

            Employee e2 = (Employee) in.readObject();
            in.close();

            System.out.println(e2.id + " " + e2.name);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}