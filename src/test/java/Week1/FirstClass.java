package Week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
       // WebDriverManager.operadriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        // go to ebay page

        driver.navigate().to("https://www.ebay.com");

        //go back to facebook
        driver.navigate().back();

        // go to ebay one more time

        driver.navigate().forward();

        //refresh ebay, still on ebay

        driver.navigate().refresh();


        System.out.println(driver.getTitle());

        driver.close();





    }



}
