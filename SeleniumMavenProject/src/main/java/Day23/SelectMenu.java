package Day23;
//Question 4:
//Write a Selenium program to automate Select Menu in DemoQA.
//Question 4:
//Write a Selenium program to automate Select Menu in DemoQA
//using id and xpath locators.

//Question 4:
//Write a Selenium program to automate Select Menu in DemoQA
//using id and xpath locators.

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMenu {

 public static void main(String[] args) throws Exception {

     // Launch Chrome Browser
     WebDriver driver = new ChromeDriver();

     // Open Website
     driver.get("https://demoqa.com/select-menu");

     // Maximize Browser
     driver.manage().window().maximize();

     Thread.sleep(2000);

     // =====================================
     // Select Value Dropdown
     // =====================================

     driver.findElement(
             By.id("withOptGroup"))
             .click();

     Thread.sleep(1000);

     driver.findElement(
             By.xpath("//div[text()='Group 1, option 1']"))
             .click();

     Thread.sleep(2000);

     // =====================================
     // Select One Dropdown
     // =====================================

     driver.findElement(
             By.id("selectOne"))
             .click();

     Thread.sleep(1000);

     driver.findElement(
             By.xpath("//div[text()='Dr.']"))
             .click();

     Thread.sleep(2000);

     // =====================================
     // Old Style Select Menu
     // =====================================

     WebElement oldMenu =
             driver.findElement(By.id("oldSelectMenu"));

     JavascriptExecutor js =
             (JavascriptExecutor) driver;

     js.executeScript(
             "arguments[0].scrollIntoView(true);",
             oldMenu);

     Thread.sleep(1000);

     Select select =
             new Select(oldMenu);

     select.selectByVisibleText("Purple");

     Thread.sleep(2000);

     // =====================================
     // Standard Multi Select Dropdown
     // =====================================

     WebElement cars =
             driver.findElement(By.id("cars"));

     Select carSelect =
             new Select(cars);

     carSelect.selectByVisibleText("Saab");

     carSelect.selectByVisibleText("Audi");

     Thread.sleep(3000);

     // Close Browser
     driver.quit();
 }
}