package Day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrintJavaLines {
    public static void main(String[] args) {
        String filePath = "src/Day10/sample.txt";
        
        System.out.println("--- Lines containing the word 'Java' ---");
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean wordFound = false;

            while ((line = reader.readLine()) != null) {
    
                if (line.contains("Java")) {
                    System.out.println(line); 
                    wordFound = true;
                }
            }
            
            if (!wordFound) {
                System.out.println("No lines containing the word 'Java' were found in the file.");
            }
            
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}