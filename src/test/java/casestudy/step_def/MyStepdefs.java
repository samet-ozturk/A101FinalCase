package casestudy.step_def;

import casestudy.pages.BasketPage;
import casestudy.pages.SearchResultPage;
import casestudy.pages.SignInPage;
import casestudy.utils.Helper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import casestudy.pages.HomePage;
import casestudy.utils.Driver;

public class MyStepdefs {
    HomePage homepage = new HomePage();
    SearchResultPage searchResultPage = new SearchResultPage();
    SignInPage signInPage = new SignInPage();

    BasketPage basketPage = new BasketPage();

    @Given("homepage is open")
    public void homepageIsOpen() {

    }

    @When("I close the pop up")
    public void iCloseThePopUp() {

        homepage.closePopup();
    }

    @When("Login hover and click")
    public void loginHoverAndClick() {
        homepage.chooseUS();

    }

    @And("login with facebook")
    public void loginWithFacebook() {
        signInPage.connectFacebook();
    }

    @And("Search for products")
    public void searchForProducts() {
        homepage.searchProducts();
    }

    @And("Product is Select")
    public void productIsSelect() {
        searchResultPage.setSelectProduct();
        Helper.waitFor(5);
        searchResultPage.setSelectBasket();


    }

    @And("Verify product in Basket")
    public void verifyProductInBasket() {
        basketPage.verifyProducts();
    }



}
