package Day10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) {
        String filePath = "src/Day10/sample.txt";
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Append Data to File ---");
        System.out.print("Please enter the new text you want to add: ");
        

        String userInput = scanner.nextLine();
        

        try (FileWriter fw = new FileWriter(filePath, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
             
            bw.newLine(); 
            bw.write(userInput); 
            
            System.out.println("Success! Your data has been added to the file.");
            
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        } finally {
            scanner.close(); 
        }
    }
}