package week3;

import utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;

public class RadioButtons {

    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://practice.cydeo.com/radio_buttons");
        List<WebElement> btns = driver.findElements(By.xpath("//input[@type=\"radio\"]"));
    }
}
