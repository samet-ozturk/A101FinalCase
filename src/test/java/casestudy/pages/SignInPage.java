package casestudy.pages;

import casestudy.utils.Driver;
import casestudy.utils.Helper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    public SignInPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@id=\"btnFacebook\"]")
    public WebElement facebookLogin;

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement facebookEmail;

    @FindBy(xpath = "//*[@id=\"pass\"]")
    public WebElement facebookPass;

    @FindBy (css="#onetrust-accept-btn-handler")
    public WebElement agreeButton;

    @FindBy(css = "#loginbutton")
    public WebElement facebookLoginButton;

    @FindBy (xpath = "//span[text()='Hesabım']")
    public WebElement loggedInText;




    public void connectFacebook() {
        agreeButton.click();
        Helper.waitFor(1);
        facebookLogin.click();
        facebookEmail.click();
        facebookEmail.sendKeys("100018049470329");
        facebookPass.click();
        facebookPass.sendKeys("sametberkmeno");

        facebookLoginButton.click();

        Helper.waitFor(5);



        System.out.println(loggedInText.getText());
        Assert.assertTrue(loggedInText.isDisplayed());



    }




}
