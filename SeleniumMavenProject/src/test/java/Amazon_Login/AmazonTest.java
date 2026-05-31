package Amazon_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AmazonTest {

    public static void main(String[] args) throws InterruptedException {

        // Chrome Options
        ChromeOptions options = new ChromeOptions();

        WebDriver driver = new ChromeDriver(options);

        // Maximize Browser
        driver.manage().window().maximize();

        // Open Amazon
        driver.get("https://www.amazon.in");

        Thread.sleep(5000);

        // Click Sign In
        driver.findElement(By.id("nav-link-accountList"))
              .click();

        Thread.sleep(3000);

        // Enter Email
        driver.findElement(By.id("ap_email_login"))
              .sendKeys("");

        // Continue
        driver.findElement(By.id("continue"))
              .click();

        Thread.sleep(3000);

        // Enter Password
        driver.findElement(By.id("ap_password"))
              .sendKeys("");

        // Sign In
        driver.findElement(By.id("signInSubmit"))
              .click();

        Thread.sleep(8000);

        // Search Product
        driver.findElement(By.id("twotabsearchtextbox"))
              .sendKeys("iPhone 16");

        // Click Search
        driver.findElement(By.id("nav-search-submit-button"))
              .click();

        Thread.sleep(5000);

        // Click First Product
        WebElement firstProduct =
                driver.findElement(By.xpath("(//h2/a)[1]"));

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();",
                firstProduct);

        Thread.sleep(5000);

        // Switch To New Tab
        for (String windowHandle : driver.getWindowHandles()) {

            driver.switchTo().window(windowHandle);
        }

        Thread.sleep(5000);

        // Add To Cart
        WebElement addToCart =
                driver.findElement(By.id("add-to-cart-button"));

        js.executeScript("arguments[0].click();",
                addToCart);

        Thread.sleep(6000);

        // Close Popup If Appears
        try {

            WebElement closePopup =
                    driver.findElement(
                            By.xpath("//button[@aria-label='Close']"));

            closePopup.click();

            Thread.sleep(3000);

        } catch (Exception e) {

            System.out.println("No Popup Found");
        }

        // Open Cart
        driver.get("https://www.amazon.in/gp/cart/view.html");

        Thread.sleep(5000);

        // Hover On Account & Lists
        Actions action = new Actions(driver);

        WebElement accountList =
                driver.findElement(
                        By.id("nav-link-accountList"));

        action.moveToElement(accountList)
              .perform();

        Thread.sleep(3000);

        // Click Sign Out
        driver.findElement(
                By.xpath("//span[text()='Sign Out']"))
              .click();

        Thread.sleep(5000);

        // Close Browser
        driver.quit();
    }
}