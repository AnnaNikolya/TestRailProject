package steps;

import config.UserConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.SignUpPage;

public class SignUpSteps {
    private BasePage basePage;
    private SignUpPage signUpPage;

    @Then("click button {string}")
    public void clickButtonTryTestRailForFree(String arg0) {
        basePage.clickButton();
    }

    @And("input Web Address")
    public void inputWebAddress() {
        signUpPage.webAddress.sendKeys(UserConfig.WEB_ADRESS);
    }
    @And("input First Name")
    public void inputFirstName() {
        signUpPage.webAddress.sendKeys(UserConfig.FIRST_NAME);
    }
    @And("input Last Name")
    public void inputLastName() {
        signUpPage.webAddress.sendKeys(UserConfig.LAST_NAME);
    }

    @And("in the field Your Country choose a value {string}")
    public void inTheFieldYourCountryChooseAValue(String arg0) {
    }

    @And("input Work Email")
    public void inputWorkEmail() {
        signUpPage.webAddress.sendKeys(UserConfig.EMAIL);
    }

    @And("input Organization")
    public void inputOrganization() {
        signUpPage.webAddress.sendKeys(UserConfig.ORGANIZATION);
    }

    @And("in the field Expected Users choose a value {string}")
    public void inTheFieldExpectedUsersChooseAValue(String arg0) {
    }

    @Then("choose input with text {string}")
    public void chooseInputWithText(String arg0) {
    }

    @When("User clicks button {string}")
    public void userClicksButtonCreateTestRailTrial() {
        basePage.buttonSignUp();
    }

    @Then("Verify")
    public void verify() {
    }

}
