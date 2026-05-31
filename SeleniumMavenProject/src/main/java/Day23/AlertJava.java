// Question 5:
// Write a Selenium program to automate Alert Box in DemoQA.

package Day23;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJava {

    public static void main(String[] args)
            throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/alerts");

        // =====================================
        // Simple Alert
        // =====================================

        driver.findElement(By.id("alertButton"))
                .click();

        Thread.sleep(2000);

        Alert alert1 =
                driver.switchTo().alert();

        alert1.accept();

        // =====================================
        // Timer Alert
        // =====================================

        driver.findElement(By.id("timerAlertButton"))
                .click();

        Thread.sleep(6000);

        Alert alert2 =
                driver.switchTo().alert();

        alert2.accept();

        // =====================================
        // Confirmation Alert
        // =====================================

        driver.findElement(By.id("confirmButton"))
                .click();

        Thread.sleep(2000);

        Alert alert3 =
                driver.switchTo().alert();

        alert3.accept();

        // =====================================
        // Prompt Alert
        // =====================================

        driver.findElement(By.id("promtButton"))
                .click();

        Thread.sleep(2000);

        Alert alert4 =
                driver.switchTo().alert();

        alert4.sendKeys("Gautam Kumar");

        alert4.accept();

        Thread.sleep(3000);

        driver.quit();
    }
}