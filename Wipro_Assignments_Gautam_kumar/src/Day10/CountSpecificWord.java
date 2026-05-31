package Day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountSpecificWord {
    public static void main(String[] args) {
        String filePath = "src/Day10/sample.txt";
        String targetWord = "Java"; 
        int count = 0;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); 
                
                for (String word : words) {
                    if (word.equals(targetWord)) {
                        count++;
                    }
                }
            }
            
            System.out.println("--- Word Count Result ---");
            System.out.println("The word '" + targetWord + "' appears " + count + " times in the file.");
            
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}