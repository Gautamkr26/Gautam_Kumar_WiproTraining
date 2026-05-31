package Day10;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCounter {

    public static void main(String[] args) {
        // Specify the path to your text file here
        String filePath = "src/Day10/sample.txt"; 

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        // Using try-with-resources to automatically close the reader
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read the file line by line until the end
            while ((line = reader.readLine()) != null) {
                lineCount++;
                
                // Add the length of the current line to the character count
                charCount += line.length();

                // To count words, we first remove leading/trailing spaces
                String trimmedLine = line.trim();
                
                // If the line is not empty, split it by whitespace to get words
                if (!trimmedLine.isEmpty()) {
                    String[] words = trimmedLine.split("\\s+");
                    wordCount += words.length;
                }
            }

            // Print the final statistics
            System.out.println("--- File Statistics ---");
            System.out.println("File processed: " + filePath);
            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + charCount);

        } catch (IOException e) {
            System.err.println("An error occurred while reading the file.");
            System.err.println("Error details: " + e.getMessage());
        }
    }
}