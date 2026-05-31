package Amazon_login_Search;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest_byproduct
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

		driver.get("https://amzn.in/d/0ijTFtdV");

		Thread.sleep(5000);

		driver.quit();

	}
}