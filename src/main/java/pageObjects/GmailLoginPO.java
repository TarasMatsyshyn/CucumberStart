package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.ChromeDriverSingleton;

public class GmailLoginPO {

    @FindBy(xpath = "//*[@id=\"identifierId\"]")
    private WebElement loginInput;

    @FindBy(xpath = "//*[@id=\"identifierNext\"]/content")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
    private WebElement passwordInput;

    @FindBy(how = How.ID, id = "passwordNext")
    private WebElement passwordButton;

    public GmailLoginPO() {
        PageFactory.initElements(ChromeDriverSingleton.getDriver(),this);
    }

    public void typeLogin(String email){
        loginInput.sendKeys(email);
        loginButton.click();
    }

    public void typePassword(String password){
        passwordInput.sendKeys(password);
        passwordButton.click();
    }

}
