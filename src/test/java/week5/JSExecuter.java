package week5;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecuter extends TestBase {

    @Test
    public void test2() {
        driver.get("http://practice.cybertekschool.com/");

        WebElement link = driver.findElement(By.xpath("//a[.='Dropdown']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", link);
    }
}
