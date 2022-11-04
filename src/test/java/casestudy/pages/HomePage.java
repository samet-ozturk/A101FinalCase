package casestudy.pages;

import casestudy.utils.Helper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import casestudy.utils.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.get(), this);

    }

    @FindBy(css = "#myAccount")
    public WebElement loginHover;
    @FindBy(css = "#login")
    public WebElement loginClick;
    @FindBy(xpath = "//input[@class=\"desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b\"]")
    public static WebElement searchInput;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[5]/div/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div[2]")
    public static WebElement searchButton;

    public void chooseUS() {
        loginHover.click();
        loginClick.click();
        Helper.waitFor(2);
    }

    public void closePopup() {
        loginClick.click();
    }

    public static void searchProducts(){
        searchInput.click();
        searchInput.sendKeys("bilgisayar");
        searchButton.click();
        Helper.waitFor(10);
    }




}