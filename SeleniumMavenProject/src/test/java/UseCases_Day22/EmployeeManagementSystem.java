package UseCases_Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmployeeManagementSystem {

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Open OrangeHRM Website
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Maximize Browser
        driver.manage().window().maximize();

        Thread.sleep(5000);

        // Enter Username
        driver.findElement(By.name("username"))
              .sendKeys("Admin");

        // Enter Password
        driver.findElement(By.name("password"))
              .sendKeys("admin123");

        // Click Login Button
        driver.findElement(By.xpath("//button[@type='submit']"))
              .click();

        Thread.sleep(5000);

        // Click PIM Module
        driver.findElement(By.xpath("//span[text()='PIM']"))
              .click();

        Thread.sleep(5000);

        // Click Add Employee
        driver.findElement(By.xpath("//button[text()=' Add ']"))
              .click();

        Thread.sleep(5000);

        // Enter First Name
        driver.findElement(By.name("firstName"))
              .sendKeys("Gautam");

        // Enter Last Name
        driver.findElement(By.name("lastName"))
              .sendKeys("Kumar");

        Thread.sleep(2000);

        // Save Employee
        driver.findElement(By.xpath("//button[@type='submit']"))
              .click();

        Thread.sleep(5000);

        // Print Page Title
        System.out.println(driver.getTitle());

        Thread.sleep(3000);

        // Logout
        driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"))
              .click();

        Thread.sleep(2000);

        driver.findElement(By.linkText("Logout"))
              .click();

        Thread.sleep(3000);

        // Close Browser
//        driver.quit();
    }
}