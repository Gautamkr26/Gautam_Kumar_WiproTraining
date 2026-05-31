package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParabankRegister {

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Open ParaBank Website
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        // Maximize Browser
        driver.manage().window().maximize();

        Thread.sleep(2000);

        // Click Register Link
        driver.findElement(By.linkText("Register"))
              .click();

        Thread.sleep(2000);

        // Enter First Name
        driver.findElement(By.id("customer.firstName"))
              .sendKeys("Gautam");

        // Enter Last Name
        driver.findElement(By.id("customer.lastName"))
              .sendKeys("Kumar");

        // Enter Address
        driver.findElement(By.id("customer.address.street"))
              .sendKeys("New Colony");

        // Enter City
        driver.findElement(By.id("customer.address.city"))
              .sendKeys("Darbhanga");

        // Enter State
        driver.findElement(By.id("customer.address.state"))
              .sendKeys("Bihar");

        // Enter Zip Code
        driver.findElement(By.id("customer.address.zipCode"))
              .sendKeys("846004");

        // Enter Phone Number
        driver.findElement(By.id("customer.phoneNumber"))
              .sendKeys("1234567891");

        // Enter SSN
        driver.findElement(By.id("customer.ssn"))
              .sendKeys("ABC12345");

        // Enter Username
        driver.findElement(By.id("customer.username"))
              .sendKeys("Gautam123");

        // Enter Password
        driver.findElement(By.id("customer.password"))
              .sendKeys("Para@123");

        // Confirm Password
        driver.findElement(By.id("repeatedPassword"))
              .sendKeys("Para@123");

        Thread.sleep(2000);

        // Click Register Button
        driver.findElement(By.xpath("//input[@value='Register']"))
              .click();

        Thread.sleep(5000);

        // Print Page Title
        System.out.println(driver.getTitle());

        // Close Browser
//        driver.quit();
    }
}