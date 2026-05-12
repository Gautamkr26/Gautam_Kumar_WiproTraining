package Day12;
import java.io.*;
import java.io.IOException;
 
public class ReadFileDemo {
public static void main(String[] args)
	{
 
		try {
			FileReader reader = new FileReader("Gautam.txt");
            int ch;
            
            while((ch=reader.read()) !=-1)
            {
            System.out.print((char) ch);
            }
			reader.close();
			}
 
		 	catch(IOException e)
            {
            	System.out.println(e);
            }
	}
	}
 