package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class StaleElementException {

    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");

        WebElement gmail = driver.findElement(By.xpath("//a[text()=\"Gmail\"]"));

        System.out.println(gmail.getText());

        driver.navigate().refresh();

        // gmail.click();

        System.out.println(gmail.getText());
    }

}
