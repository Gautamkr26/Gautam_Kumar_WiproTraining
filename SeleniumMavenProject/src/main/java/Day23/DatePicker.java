package Day23;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

    public static void main(String[] args)
            throws InterruptedException {

        WebDriver driver =
                new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/date-picker");

        Thread.sleep(2000);

        // =====================================
        // Select Date
        // =====================================

        driver.findElement(
                By.id("datePickerMonthYearInput"))
                .click();

        Thread.sleep(1000);

        driver.findElement(
                By.id("datePickerMonthYearInput"))
                .sendKeys(Keys.CONTROL + "a");

        Thread.sleep(1000);

        driver.findElement(
                By.id("datePickerMonthYearInput"))
                .sendKeys("08/16/2025");

        Thread.sleep(1000);

        driver.findElement(
                By.id("datePickerMonthYearInput"))
                .sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        // =====================================
        // Date And Time Picker
        // =====================================

        driver.findElement(
                By.id("dateAndTimePickerInput"))
                .click();

        Thread.sleep(1000);

        driver.findElement(
                By.id("dateAndTimePickerInput"))
                .sendKeys(Keys.CONTROL + "a");

        Thread.sleep(1000);

        driver.findElement(
                By.id("dateAndTimePickerInput"))
                .sendKeys("August 16, 2026 10:30 AM");

        Thread.sleep(1000);

        driver.findElement(
                By.id("dateAndTimePickerInput"))
                .sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        driver.quit();
    }
}