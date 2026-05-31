package utilities; 
import org.testng.annotations.DataProvider; 
public class DataProviders { 
@DataProvider(name = "loginData") 
public Object[][] getData() { 
return new Object[][] { 
{"gk@gmail.com", "Gautam@123"} 
}; 
} 
} 