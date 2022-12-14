package ExtraTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task1 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void getUrl() {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @Test
    public void getLinkNumber() {
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
