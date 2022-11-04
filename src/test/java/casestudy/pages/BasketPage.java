package casestudy.pages;

import casestudy.utils.Driver;
import casestudy.utils.Helper;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {
    public BasketPage() {
        PageFactory.initElements(Driver.get(), this);

    }

    SearchResultPage searchresultpage = new SearchResultPage();
    public void verifyProducts(){
        Assert.assertEquals( searchresultpage.productNameText+"Gri",Helper.getProductNameInBasket());
    }

}