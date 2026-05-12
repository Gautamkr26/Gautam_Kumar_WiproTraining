package Day12;
import java.io.*;
import java.util.*;

public class EcommerceApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Order ID: ");
            int orderId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Customer Name: ");
            String customer = sc.nextLine();

            System.out.print("Enter Product Name: ");
            String product = sc.nextLine();

            System.out.print("Enter Shipping Address: ");
            String address = sc.nextLine();

            FileWriter fw = new FileWriter("orders.txt", true);

            fw.write("Order ID: " + orderId + "\n");
            fw.write("Customer: " + customer + "\n");
            fw.write("Product: " + product + "\n");
            fw.write("Address: " + address + "\n");
            fw.write("----------------------\n");

            fw.close();

            BufferedReader br = new BufferedReader(new FileReader("orders.txt"));

            String line;

            System.out.println("\nStored Orders");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}