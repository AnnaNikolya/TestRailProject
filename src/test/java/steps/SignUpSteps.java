package steps;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SignUpPage;

public class SignUpSteps extends BaseSteps {
    HomePage homePage;
    SignUpPage signUpPage;

    private void enterValue() {
        signUpPage = new SignUpPage();
    }

    @Before
    public void signUp() {
        homePage = new HomePage();
    }

    @Given("At Home page")
    public void openHomePageForLogin() {
        homePage.openHomePage();
    }

    @Then("click button 'Try TestRail for Free' on HomePage")
    public void clickButtonForLogin() {
        homePage.clickButtonForFree();
    }

    @And("^input Web Address 'testrailmailinator'$")
    public void inputWebAddress() {
        signUpPage.enterValue("testrailmailinator");
    }

    @And("input First Name 'FIRST'")
    public void inputFirstNameFIRST() {
        signUpPage.enterFirstName("FIRST");
    }

    @And("input Last Name 'LAST'")
    public void inputLastName(String lastName) {
        signUpPage.enterLasttName("LAST");
    }

    @And("in the field Your Country choose a value 'Belarus'")
    public void inTheFieldYourCountryChooseAValue() {
        signUpPage.chooseCountry("Belarus");
    }

    @And("input Work Email 'testrail@mailinator.com'")
    public void inputWorkEmail(String workEmail) {
        signUpPage.enterWorkEmail("testrail@mailinator.com");
    }

    @And("input Organization")
    public void inputOrganization(String organization) {
        signUpPage.enterOrganization("OOO");
    }

    @And("in the field Expected Users choose a value '1'")
    public void inTheFieldExpectedUsersChooseAValue() {
        signUpPage.chooseAValue();
    }

    @Then("choose input with text {string}")
    public void chooseInputWithText(String agree) {
        signUpPage.chooseAgree();
    }

    @When("User clicks button 'Create TestRail Trial'")
    public void userClicksButtonCreateTestRailTrial() {
        signUpPage.clickButtonForFree();
    }

    @Then("Verify text 'Waiting for email confirmation from'")
    public void verifyText(String someText) {
        signUpPage.verify(someText);
    }
}


