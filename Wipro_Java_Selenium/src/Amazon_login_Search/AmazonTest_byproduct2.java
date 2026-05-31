package Amazon_login_Search;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest_byproduct2
{
	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/dp/B0GNMY1HHY");

		driver.manage().window().maximize();

		Thread.sleep(10000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript(
		"arguments[0].click();",
		driver.findElement(By.id("add-to-cart-button"))
		);

		Thread.sleep(5000);

		driver.quit();

	}
}