package Day11;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class IO_ex2 {
  public static void main(String[] args) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("Sagnik.txt"))) {
      bw.write("Hello Sagnik");
      System.out.println("Successful");
    } catch (IOException e) {
      System.out.println("Error");
    }
  }
}
