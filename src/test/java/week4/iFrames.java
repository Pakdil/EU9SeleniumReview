package week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class iFrames {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void getUrl() {
        driver.get("http://practice.cybertekschool.com/nested_frames");
    }

    @Test
    public void test1 () {
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        System.out.println(driver.findElement(By.xpath("//body")).getText());
    }

    @Test
    public void test2() {
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame(1);
        System.out.println(driver.findElement(By.xpath("//body")).getText());

    }

    @Test
    public void test3() {

    }
}
