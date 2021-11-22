package casestudy.pages;

import casestudy.utils.Driver;
import casestudy.utils.Helper;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    public SignInPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(tagName = "h1")
    public WebElement title;
    @FindBy(xpath = "//*[@id=\"fld-e\"]")
    public WebElement eMail;
    @FindBy(xpath = "//*[@id=\"fld-p1\"]")
    public WebElement password;
    @FindBy(css = ".plButton-label.v-ellipsis")
    public WebElement hiText;
    @FindBy(xpath = "//button[contains(text(),'Sign in with Google')]")
    public WebElement googleButton;
    public void verifyTitle() {
        Assert.assertEquals("Sign In to Best Buy", title.getText());
    }

    public void fillInformation() {
        eMail.click();
        eMail.sendKeys("nemot85539@nefacility.com");
        password.click();
        password.sendKeys("Kloia+test123");

    }

    public void sendEnter(){
        password.sendKeys(Keys.RETURN);
    }

    public void verifySignIn (){
        Assert.assertTrue(hiText.getText().contains("Hi"));
    }

    public void openGoogleLogin() {
        googleButton.click();

    }
}
