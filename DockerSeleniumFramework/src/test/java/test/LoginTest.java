package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.name("username")))
                .sendKeys("Admin");

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.name("password")))
                .sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']"))
                .click();

        wait.until(ExpectedConditions.urlContains("dashboard"));

        System.out.println("Login Successful");
    }
}