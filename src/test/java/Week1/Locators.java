package Week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cydeo.com/");

        // using id locator

        WebElement uniqueId = driver.findElement(By.id("flash-messages"));
        System.out.println(uniqueId.getTagName());

        // using name locator

        WebElement meta = driver.findElement(By.name("viewport"));
        System.out.println(meta.getTagName());

        //using class name

        WebElement title = driver.findElement(By.className("h1y"));
        System.out.println(title.getText());

        WebElement ul = driver.findElement(By.className("list-group"));
        System.out.println(ul.getTagName());



    }


}
