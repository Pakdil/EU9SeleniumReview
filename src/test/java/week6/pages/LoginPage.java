package week6.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(name = "username")
    public WebElement nameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(id = "wooden_spoon")
    public WebElement loginBtn;


    public void loginMethod(String username, String password) {

        nameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

}
