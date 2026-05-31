package UseCases_Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommercePurchaseFlow {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
              .click();

        Thread.sleep(3000);

        driver.findElement(
                By.id("add-to-cart-sauce-labs-backpack"))
              .click();

        Thread.sleep(2000);

        driver.findElement(
                By.className("shopping_cart_link"))
              .click();

        Thread.sleep(3000);

        driver.findElement(
                By.xpath("//button[@id='checkout']"))
              .click();

        Thread.sleep(2000);

        driver.findElement(By.id("first-name"))
              .sendKeys("Gautam");

        driver.findElement(By.id("last-name"))
              .sendKeys("Kumar");

        driver.findElement(By.id("postal-code"))
              .sendKeys("840001");

        driver.findElement(By.id("continue"))
              .click();

        Thread.sleep(2000);

        driver.findElement(By.id("finish"))
              .click();

        Thread.sleep(3000);

        String message = driver.findElement(
                By.className("complete-header"))
                .getText();

        System.out.println(message);

//        driver.quit();
    }
}