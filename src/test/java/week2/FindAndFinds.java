package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindAndFinds {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cydeo.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));

//        for (WebElement link : links) {
//            System.out.println(link.getText());
//
//        }
//
//        System.out.println(links.get(10).getText());
//        links.get(3).click();



       driver.findElement(By.xpath("//a[text()=\"Multiple Buttons\"]")).click();
       List<WebElement> btns = driver.findElements(By.className("btn btn-primary"));
       for (WebElement btn : btns) {
           btn.click();
           Thread.sleep(1000);
       }

    }
}
