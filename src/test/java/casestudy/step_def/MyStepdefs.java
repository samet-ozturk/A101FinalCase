package casestudy.step_def;

import casestudy.pages.SearchResultPage;
import casestudy.pages.SignInPage;
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

    @Given("homepage is open")
    public void homepageIsOpen() {
        homepage.chooseUS();
    }

    @When("I close the pop up")
    public void iCloseThePopUp() {

        homepage.closePopup();
    }


    @When("Page title verification")
    public void pageTitleVerification() {
        homepage.getPageTitle();
    }

    @Then("Maximize windows")
    public void maximizeWindows() {
        Driver.get().manage().window().maximize();
    }

    @And("Search for Drone")
    public void searchForDrone() {
        homepage.searchInput.click();
        homepage.searchInput.sendKeys("drone");
        homepage.searchButton.click();

    }

    @And("Verify search results are listed for Drone")
    public void verifySearchResultsAreListedForDrone() {
        searchResultPage.verifySearchResult();
    }

    @When("I open {string} dropdown menu")
    public void iOpenDropdownMenu(String dropdown) {
        homepage.openDropdown(dropdown);
    }

    @Then("I Choose {string} submenu")
    public void IChooseSubmenu(String submenu) {
        homepage.openSubmenu(submenu);
    }

    @Then("Sign in page should open")
    public void signInPageShouldOpen() {
        signInPage.verifyTitle();
    }

    @Then("I filled account information")
    public void iFilledAccountInformation() {
        signInPage.fillInformation();
    }

    @And("I press Enter button")
    public void iPressEnterButton() {
        signInPage.sendEnter();
    }
    @And("Verify successful login")
    public void verifySuccessfulLogin() {
        signInPage.verifySignIn();
    }


    @Then("Sign in with Google")
    public void signInWithGoogle() {
        signInPage.openGoogleLogin();
    }
}
