
// Question 2:
// Write a Selenium program to automate Checkbox in DemoQA.
package Day23;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.className("rct-checkbox"))
                .click();

        Thread.sleep(3000);

        driver.quit();
    }
}