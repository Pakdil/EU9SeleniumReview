package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;


public class Waits {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();

//        driver.get("https://practice.cydeo.com/dynamic_loading/4");
//
//        Thread.sleep(6000);
//
//        System.out.println(driver.findElement(By.xpath("//div[@id=\"finish\"]/h4")).isDisplayed());

        driver.get("https://practice.cydeo.com/dynamic_loading/3");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.println(driver.findElement(By.id("login")).getAttribute("name"));


    }
}