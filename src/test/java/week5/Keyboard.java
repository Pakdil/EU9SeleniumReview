package week5;

import base.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keyboard extends TestBase {

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/key_presses");
        Actions actions = new Actions(driver);

        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.SPACE).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.F1).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.BACK_SPACE).perform();
        Thread.sleep(1000);

    }
}
