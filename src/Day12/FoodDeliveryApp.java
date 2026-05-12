package Day12;

import java.io.*;

public class FoodDeliveryApp {
  public static void main(String[] args) {

      try {
          FileWriter fw = new FileWriter("order.txt", true);

          fw.write("Order: Burger x2 | Customer: Gautam | Status: Delivered\n");
          fw.write("Order: Pizza x1 | Customer: Eklove | Status: Pending\n");

          fw.close();

          System.out.println("Delivery logs saved!");

      } catch (IOException e) {
          System.out.println(e);
      }
  }
}