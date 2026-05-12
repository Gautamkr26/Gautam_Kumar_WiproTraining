package Day12;
import java.io.*;
import java.util.Scanner;

public class PersonalNoteApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String fileName = "myNotes.txt";

        try {
            System.out.println("=== Welcome to Personal Note Maker ===");
            System.out.print("Enter your Name: ");
            String name = keyboard.nextLine();

            System.out.print("Enter a note to save: ");
            String note = keyboard.nextLine();

            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("User: " + name);
            bw.newLine();
            bw.write("Note: " + note);
            bw.newLine();
            bw.write("------------------------------");
            bw.newLine();
            
            bw.close(); 
            System.out.println("\n Data saved successfully in " + fileName);
            System.out.println("\n=== Reading All Saved Notes ===");
            File myFile = new File(fileName);
            
            if (myFile.exists()) {
                Scanner fileReader = new Scanner(myFile); 
                while (fileReader.hasNextLine()) {
                    System.out.println(fileReader.nextLine());
                }
                fileReader.close();
            } else {
                System.out.println("File not found!");
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            keyboard.close(); 
        }
    }
}