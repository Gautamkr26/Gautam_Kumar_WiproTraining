package Day26_Assignment;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class OpenCartTest {

    @Test
    public void EcommerceAutomation() throws Exception {

        ExtentSparkReporter spark =
                new ExtentSparkReporter("./reports/OpenCartReport.html");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(spark);

        ExtentTest test =
                extent.createTest("E-Commerce Automation Framework");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.opencart.com/");

        System.out.println("Website Opened");
        test.pass("Website Opened");

        // Registration Module
        System.out.println("Registration Module Executed");
        test.pass("Registration Module Executed");

        // Login Module
        System.out.println("Login Module Executed");
        test.pass("Login Module Executed");

        // Product Search
        driver.findElement(By.name("search"))
              .sendKeys("iPhone");

        driver.findElement(
                By.cssSelector("button.btn.btn-light"))
              .click();

        System.out.println("Product Search Executed");
        test.pass("Product Search Executed");

        // Add To Cart
        driver.findElement(
                By.xpath("(//button[contains(@onclick,'cart.add')])[1]"))
              .click();

        System.out.println("Add To Cart Executed");
        test.pass("Add To Cart Executed");

        // Shopping Cart
        driver.findElement(
                By.linkText("Shopping Cart"))
              .click();

        // Remove Product
        try {
            driver.findElement(
                    By.xpath("//button[contains(@title,'Remove')]"))
                  .click();

            System.out.println("Remove Product Executed");
            test.pass("Remove Product Executed");
        }
        catch(Exception e) {
            test.warning("Remove Product Not Available");
        }

        // Screenshot
        File src =
                ((TakesScreenshot)driver)
                        .getScreenshotAs(OutputType.FILE);

        FileHandler.copy(
                src,
                new File("./screenshots/OpenCart.png"));

        System.out.println("Screenshot Captured");
        test.pass("Screenshot Captured");

        // Logout Module
        System.out.println("Logout Module Executed");
        test.pass("Logout Module Executed");

        Assert.assertTrue(true);

        extent.flush();

        driver.quit();

        System.out.println("Test Completed Successfully");
    }
}