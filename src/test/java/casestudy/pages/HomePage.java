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

    @FindBy(css = "[alt='United States']")
    public WebElement country;
    @FindBy(css = ".c-close-icon.c-modal-close-icon")
    public WebElement closeButton;
    @FindBy(css ="#gh-search-input")
    public WebElement searchInput;
    @FindBy(css= ".header-search-button")
    public WebElement searchButton;

    public void chooseUS() {
        country.click();
    }

    public void closePopup() {
        closeButton.click();
    }

    public void getPageTitle() {
        String expectedTitle = "Best Buy | Official Online Store | Shop Now & Save";

        Assert.assertEquals(expectedTitle, Driver.get().getTitle());
        System.out.println(Driver.get().getTitle());
    }

    public void openDropdown(String dropdown) {
        String locator = "//span[text()='" + dropdown + "']";
        Driver.get().findElement(By.xpath(locator)).click();
    }

    public void openSubmenu(String submenu) {
        Helper.clickWithLinkText(submenu);
    }

}