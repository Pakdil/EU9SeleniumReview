package week5;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class Hover extends TestBase {

    @Test
    public void test1() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/hovers");
        Actions actions = new Actions(driver);
        List<WebElement> hovers = driver.findElements(By.xpath("//div[@class='figure']"));
        for (WebElement hover : hovers) {
            actions.moveToElement(hover).perform();
            Thread.sleep(1000);
        }


    }
}
