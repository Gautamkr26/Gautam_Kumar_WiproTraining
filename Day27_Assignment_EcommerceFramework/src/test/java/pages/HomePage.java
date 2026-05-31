package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    By addBag =
            By.id("add-to-cart-sauce-labs-backpack");

    By addBike =
            By.id("add-to-cart-sauce-labs-bike-light");

    By cart =
            By.className("shopping_cart_link");

    public void addProducts() {

        driver.findElement(addBag).click();

        driver.findElement(addBike).click();
    }

    public void openCart() {

        driver.findElement(cart).click();
    }
}