package casestudy.pages;

import casestudy.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
    public SearchResultPage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(css=".search-title")
    public WebElement searchTitle;

    public void verifySearchResult(){
        String actualSearchTitle = searchTitle.getText();
        Assert.assertTrue(actualSearchTitle.contains("drone"));
    }}
