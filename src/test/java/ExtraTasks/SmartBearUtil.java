package ExtraTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SmartBearUtil {

    public void login(String driverType) {

        WebDriver driver = null;

        switch (driverType) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                break;
            case "safari":
                WebDriverManager.safaridriver().setup();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                break;
            default:
                System.out.println("\"Please enter a valid browser name in lowercase\" = " + "Please enter a valid browser name in lowercase");
        }

        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));

        userName.sendKeys("Tester");
        password.sendKeys("test");
        loginBtn.click();

        List<WebElement> links = driver.findElements(By.xpath("//a"));
        System.out.println("links cont = " + links.size());

        for (WebElement link : links) {
            System.out.println("link text = " + link.getText());

        }


    }
}
