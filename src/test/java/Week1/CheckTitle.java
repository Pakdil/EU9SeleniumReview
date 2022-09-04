package Week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTitle {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        // User stroy

        String title = driver.getTitle();

        if (title.equals("Practice")) {
            System.out.println("The title is correct");
        } else {
            System.out.println("The title is not correct");
        }


        System.out.println("The current URL the page is: "+ driver.getCurrentUrl());


        driver.close();
    }

}
