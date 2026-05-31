package Day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_SQL {

    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Day26",
                "root",
                "Gautamkr@26");

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(
                "SELECT username, password FROM users");

        while (rs.next()) {

            String username = rs.getString("username");
            String password = rs.getString("password");

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.saucedemo.com/");

            driver.findElement(By.id("user-name")).sendKeys(username);

            driver.findElement(By.id("password")).sendKeys(password);

            driver.findElement(By.id("login-button")).click();
//
//            Thread.sleep(3000);

if(driver.getCurrentUrl().contains("inventory.html"))
{
    System.out.println("Login Successful : " + username);
}
else
{
    System.out.println("Login Failed : " + username);
}

            driver.quit();
        }

        rs.close();
        stmt.close();
        con.close();
    }
}