package UseCases_Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankingFundTransfer {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.name("username"))
              .sendKeys("Gautam123");

        driver.findElement(By.name("password"))
              .sendKeys("Para@123");

        driver.findElement(By.xpath("//input[@value='Log In']"))
              .click();

        Thread.sleep(3000);

        driver.findElement(By.linkText("Transfer Funds"))
              .click();

        Thread.sleep(2000);

        driver.findElement(By.id("amount"))
              .sendKeys("5000");

        Thread.sleep(2000);

        driver.findElement(
                By.xpath("//input[@value='Transfer']"))
              .click();

        Thread.sleep(3000);

        String message = driver.findElement(
                By.className("title"))
                .getText();

        System.out.println(message);

        Thread.sleep(3000);

        driver.findElement(By.linkText("Log Out"))
              .click();

        Thread.sleep(3000);

//        driver.quit();
    }
}