package Day25;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FlightSearchFluentWait {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://phptravels.net/flights/del/lon/oneway/economy/24-05-2026/1/0/0");

        driver.findElement(By.id("acknowledgeDemoWarning")).click();

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement flightList = wait.until(
                d -> d.findElement(By.xpath("//main"))
        );

        System.out.println("Flight Search Results Loaded Successfully");
        System.out.println("Flight List Displayed: " + flightList.isDisplayed());
        
        
        
// driver.quit();
    }
}