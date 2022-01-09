package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.*;

public class SignUpSteps extends BaseSteps{
    private static final String HOME_PAGE = "https://www.gurock.com/testrail/";
    private static final String TRY_TEST_RAIL_FOR_FREE = "//*[@id='et_builder_outer_content']//*[@class='btn btn-medium btn-green'][@role = 'button']";

    @Given("At Home page")
    public void openHomePageForLogin(){
       open(HOME_PAGE);
       // homePage.openHomePage(HOME_PAGE);
    }

    @Then("click button {string} on HomePage")
    public void clickButtonForLogin() {
        homePage.clickButtonTTRFF($(By.xpath(TRY_TEST_RAIL_FOR_FREE)));
    }
    }
