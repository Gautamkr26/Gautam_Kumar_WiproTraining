//Question 1:
//Write a Selenium program to automate Text Box Form in DemoQA.
package Day23;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

 public static void main(String[] args) throws Exception {

     WebDriver driver = new ChromeDriver();

     driver.get("https://demoqa.com/text-box");
     driver.manage().window().maximize();

     driver.findElement(By.id("userName"))
             .sendKeys("Gautam Kumar");

     driver.findElement(By.id("userEmail"))
             .sendKeys("Gautam@gmail.com");

     driver.findElement(By.id("currentAddress"))
             .sendKeys("Patna");

     driver.findElement(By.id("permanentAddress"))
             .sendKeys("Bihar");

     driver.findElement(By.id("submit")).click();

     Thread.sleep(3000);

     driver.quit();
 }
}