package Selenium_Day19;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeSongPlay 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.findElement(By.name("search_query"))
		.sendKeys("selenium java");

		driver.findElement(By.name("search_query"))
		.sendKeys(Keys.ENTER);

		Thread.sleep(5000);

		driver.findElement(By.id("video-title")).click();

		Thread.sleep(30000);

		driver.quit();

	}
}