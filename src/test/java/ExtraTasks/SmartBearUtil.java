package ExtraTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;

public class SmartBearUtil {

    public void login(String driverType) {

        WebDriver driver = null;

        switch (driverType) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                break;
            case "safari":
                    WebDriverManager.safaridriver().setup();
                    break;
            case "edge":
                        WebDriverManager.edgedriver().setup();
                        break;
            default:
                System.out.println("\"Please enter a valid browser name in lowercase\" = " + "Please enter a valid browser name in lowercase");
        }

    }




}
