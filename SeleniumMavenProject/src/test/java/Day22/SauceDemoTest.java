package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Open SauceDemo Website
        driver.get("https://www.saucedemo.com/");

        // Maximize Browser
        driver.manage().window().maximize();

        // Wait
        Thread.sleep(2000);

        // Enter Username
        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        // Enter Password
        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        // Click Login Button
        driver.findElement(By.id("login-button"))
              .click();

        // Wait after login
        Thread.sleep(5000);

        // Print Page Title
        System.out.println(driver.getTitle());

        // Close Browser
        driver.quit();
    }
}