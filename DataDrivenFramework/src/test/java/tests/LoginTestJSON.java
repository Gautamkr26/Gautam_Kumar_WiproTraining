package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.JsonUtils;

public class LoginTestJSON extends BaseTest {

    @Test
    public void loginTestJSON() {

        driver.get(
        "https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.name("username"))
                .sendKeys(
                JsonUtils.getValue("username"));

        driver.findElement(By.name("password"))
                .sendKeys(
                JsonUtils.getValue("password"));

        driver.findElement(
                By.xpath("//button[@type='submit']"))
                .click();

        Assert.assertTrue(
                driver.findElement(
                By.xpath("//h6[text()='Dashboard']"))
                .isDisplayed());

        System.out.println("JSON TEST PASSED");
    }
}