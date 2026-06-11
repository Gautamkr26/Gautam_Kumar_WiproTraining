package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.CsvUtils;

public class LoginTestCSV extends BaseTest {

    @Test
    public void loginTestCSV() {

        String[] data =
                CsvUtils.getLoginData();

        driver.get(
        "https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.name("username"))
                .sendKeys(data[0]);

        driver.findElement(By.name("password"))
                .sendKeys(data[1]);

        driver.findElement(
                By.xpath("//button[@type='submit']"))
                .click();

        Assert.assertTrue(
                driver.findElement(
                By.xpath("//h6[text()='Dashboard']"))
                .isDisplayed());

        System.out.println("CSV TEST PASSED");
    }
}