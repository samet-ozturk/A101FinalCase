package casestudy.pages;

import casestudy.utils.Driver;
import casestudy.utils.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

import static casestudy.utils.Driver.get;

public class SearchResultPage {

    public SearchResultPage() {
        PageFactory.initElements(get(), this);

    }


    @FindBy(css = "#i1")
    public static WebElement selectProduct;


    public static void setSelectProduct(){

       selectProduct.click();
       Helper.waitFor(3);

        Set<String> windowAllWindows = Driver.get().getWindowHandles();
        for (String window:windowAllWindows){
            Driver.get().switchTo().window(window);

        }



    }

    @FindBy (css="#product-name")
    WebElement productName;

    @FindBy (css="a[href='https://checkout.hepsiburada.com/sepetim']")
    WebElement shoppingCart;

    public static String productNameText = "";
    public void setSelectBasket(){
        productNameText = productName.getText();
        Helper.addTwoDifferentProducts(".add-to-basket.button.small");
        Helper.waitFor(1);
        shoppingCart.click();
    }



}
