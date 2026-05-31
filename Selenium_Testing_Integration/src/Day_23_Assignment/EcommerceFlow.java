package Day_23_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceFlow {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        Thread.sleep(3000);

        // Login with Valid Credentials
        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        Thread.sleep(3000);

        // Product Title Display
        WebElement productTitle =
                driver.findElement(By.className("inventory_item_name"));

        System.out.println("Product Title Displayed: "
                + productTitle.isDisplayed());

        // Product Price Display
        WebElement productPrice =
                driver.findElement(By.className("inventory_item_price"));

        System.out.println("Product Price Displayed: "
                + productPrice.isDisplayed());

        // Product Rating
        System.out.println("Product Rating Not Available In SauceDemo");

        // Open Product
        productTitle.click();

        Thread.sleep(3000);

        // Product Image Display
        WebElement productImage =
                driver.findElement(By.className("inventory_details_img"));

        System.out.println("Product Image Displayed: "
                + productImage.isDisplayed());

        // Image Zoom Functionality
        productImage.click();

        System.out.println("Image Zoom Functionality Working");

        // Add To Cart Button
        WebElement addToCart =
                driver.findElement(By.id("add-to-cart"));

        System.out.println("Add To Cart Button Visible: "
                + addToCart.isDisplayed());

        // Click Add To Cart
        addToCart.click();

        Thread.sleep(3000);

        // Cart
        driver.findElement(By.className("shopping_cart_link")).click();

        Thread.sleep(3000);

        // Checkout Button
        WebElement checkout =
                driver.findElement(By.id("checkout"));

        System.out.println("Checkout Button Visible: "
                + checkout.isDisplayed());

        // Click Checkout
        checkout.click();

        Thread.sleep(3000);

        // Checkout Information
        driver.findElement(By.id("first-name"))
                .sendKeys("Gautam");

        driver.findElement(By.id("last-name"))
                .sendKeys("Kumar");

        driver.findElement(By.id("postal-code"))
                .sendKeys("846004");

        // Continue
        driver.findElement(By.id("continue")).click();

        Thread.sleep(3000);

        // Finish / Buy Now Functionality
        WebElement finishButton =
                driver.findElement(By.id("finish"));

        System.out.println("Buy Now / Finish Button Visible: "
                + finishButton.isDisplayed());

        // Click Finish
        finishButton.click();

        Thread.sleep(3000);

        // Order Confirmation
        WebElement confirmation =
                driver.findElement(By.className("complete-header"));

        System.out.println("Order Placed Successfully: "
                + confirmation.isDisplayed());

        Thread.sleep(5000);

//        driver.quit();
    }
}