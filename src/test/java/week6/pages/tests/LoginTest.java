package week6.pages.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;
import week6.pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;
    @BeforeMethod
    public void setUp() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = new LoginPage();

    }

    @Test
    public void loginTest() {
        String username = "tomsmith";
        String password = "SuperSecretPassword";
        loginPage.loginMethod(username, password);
    }


}
