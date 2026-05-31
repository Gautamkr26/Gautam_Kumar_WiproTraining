package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    WebDriver driver;

    public CheckoutPage(WebDriver driver) {

        this.driver = driver;
    }

    By firstName =
            By.id("first-name");

    By lastName =
            By.id("last-name");

    By postalCode =
            By.id("postal-code");

    By continueBtn =
            By.id("continue");

    public void enterDetails() {

        driver.findElement(firstName)
                .sendKeys("Gautam");

        driver.findElement(lastName)
                .sendKeys("Kumar");

        driver.findElement(postalCode)
                .sendKeys("800001");

        driver.findElement(continueBtn)
                .click();
    }
}