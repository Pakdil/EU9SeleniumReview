package week3;

import org.openqa.selenium.*;
import utilities.*;

import java.util.List;

public class CheckBox {

    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://practice.cydeo.com/checkboxes");

        List<WebElement> lables = driver.findElements(By.className("checktext"));
        List<WebElement> boxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (WebElement lable : lables) {
            System.out.println(lable.getText());
        }

            for (WebElement box : boxes) {
                System.out.println(box.isSelected());
            }

    }
}
