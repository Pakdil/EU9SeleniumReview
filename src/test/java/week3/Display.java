package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Display {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Driver.getDriver();
        driver.get("https://practice.cydeo.com/dynamic_loading/1");
        WebElement lable = Driver.getDriver().findElement(By.xpath("//div[@id=\"finish\"]/h4"));
        System.out.println(lable.isDisplayed());

        Driver.getDriver().findElement(By.xpath("//div[@id='start']/button")).click();

        Thread.sleep(5000);

        WebElement lable1 = Driver.getDriver().findElement(By.xpath("//div[@id=\"finish\"]/h4"));

        System.out.println(lable1.isDisplayed());


    }
}
