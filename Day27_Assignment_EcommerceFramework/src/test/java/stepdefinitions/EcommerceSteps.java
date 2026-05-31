package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;

public class EcommerceSteps {

    WebDriver driver;

    LoginPage loginPage;

    HomePage homePage;

    CartPage cartPage;

    CheckoutPage checkoutPage;

    @Given("User launches browser")
    public void user_launches_browser() throws InterruptedException {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        Thread.sleep(2000);
    }

    @When("User logs in using {string} and {string}")
    public void user_logs_in(String username, String password)
            throws InterruptedException {

        loginPage = new LoginPage(driver);

        loginPage.login(username, password);

        Thread.sleep(3000);
    }

    @And("User adds multiple products to cart")
    public void add_products() throws InterruptedException {

        homePage = new HomePage(driver);

        homePage.addProducts();

        Thread.sleep(2000);

        homePage.openCart();

        Thread.sleep(3000);
    }

    @And("User removes one product from cart")
    public void remove_product() throws InterruptedException {

        cartPage = new CartPage(driver);

        cartPage.removeProduct();

        Thread.sleep(3000);
    }

    @Then("User validates total amount")
    public void validate_total() throws InterruptedException {

        String price =
                driver.findElement(By.className("inventory_item_price"))
                        .getText();

        System.out.println("Total Price: " + price);

        Thread.sleep(3000);
    }

    @And("User proceeds to checkout")
    public void checkout() throws InterruptedException {

        cartPage.checkout();

        Thread.sleep(3000);

        checkoutPage = new CheckoutPage(driver);

        checkoutPage.enterDetails();

        Thread.sleep(4000);
    }

    @And("User logs out")
    public void logout() throws InterruptedException {

        Thread.sleep(3000);

        driver.quit();
    }
}