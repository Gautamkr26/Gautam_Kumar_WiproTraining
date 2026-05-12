package Day12;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 
public class UserFileApp {
public static void main(String[] args)
	{
 
		try {
			FileWriter writer = new FileWriter("Gautam.txt");
			
			writer.write("Hello my name is Gautam");
			writer.write(" and I am learning Java File Handling");
 
			writer.close();
			System.out.println("Data Written Successfully");
			}
 
		catch(IOException e)
            {
            	System.out.println(e);
            }
	}
	}