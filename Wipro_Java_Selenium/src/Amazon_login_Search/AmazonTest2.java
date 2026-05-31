package Amazon_login_Search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonTest2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.findElement(By.id("nav-link-accountList")).click();

		Thread.sleep(3000);

		driver.findElement(By.name("email"))
		.sendKeys(Credentials.email);

		driver.findElement(By.id("continue")).click();

		Thread.sleep(3000);

		driver.findElement(By.name("password"))
		.sendKeys(Credentials.password);

		driver.findElement(By.id("signInSubmit")).click();

		Thread.sleep(8000);

		driver.findElement(By.id("twotabsearchtextbox"))
		.sendKeys("vivobook 14pro");

		driver.findElement(By.id("nav-search-submit-button"))
		.click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("(//h2[contains(@class,'a-size-mini')]/a)[1]"))
		.click();

		Thread.sleep(5000);

		for(String win : driver.getWindowHandles())
		{
			driver.switchTo().window(win);
		}

		Thread.sleep(3000);

		driver.findElement(By.id("add-to-cart-button"))
		.click();

		Thread.sleep(5000);

		driver.findElement(By.name("proceedToRetailCheckout"))
		.click();

		Thread.sleep(5000);

		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(By.id("nav-link-accountList")))
		.perform();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Sign Out"))
		.click();

		Thread.sleep(5000);

		driver.quit();

	}
}