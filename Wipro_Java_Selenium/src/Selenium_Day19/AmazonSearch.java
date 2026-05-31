package Selenium_Day19;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("nav-link-accountList")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ap_email"))
		.sendKeys("your_email");
		
		driver.findElement(By.id("continue")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ap_password"))
		.sendKeys("your_password");
		
		driver.findElement(By.id("signInSubmit")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("twotabsearchtextbox"))
		.sendKeys("Laptop");
		
		driver.findElement(By.id("nav-search-submit-button"))
		.click();
		
		Thread.sleep(5000);
		
		driver.quit();

	}
}