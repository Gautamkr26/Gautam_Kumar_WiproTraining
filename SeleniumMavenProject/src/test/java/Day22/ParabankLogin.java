package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParabankLogin {

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Open ParaBank Website
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        // Maximize Browser
        driver.manage().window().maximize();

        Thread.sleep(2000);

        // Enter Username
        driver.findElement(By.name("username"))
              .sendKeys("Gautam123");

        // Enter Password
        driver.findElement(By.name("password"))
              .sendKeys("Para@123");

        // Click Login Button
        driver.findElement(By.xpath("//input[@value='Log In']"))
              .click();

        Thread.sleep(5000);

        // Print Page Title
        System.out.println(driver.getTitle());

        // Close Browser
//        driver.quit();
    }
}