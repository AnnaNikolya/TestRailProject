package steps;

import io.cucumber.java.en.Given;

import static com.codeborne.selenide.Selenide.*;

public class TestRailSteps {
    @Given("At Home page")
    public void openHomePage(){
    open("https://www.gurock.com/testrail/");
    }
}
