package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SignUpPage extends BasePage {
    private final SelenideElement webAddressInput = $("#hostname");//правильно SelenideElement или String
    public static final String FIRST_NAME_INPUT = "#first_name";
    public static final String LAST_NAME_INPUT = "#last_name";
    public static final String YOUR_COUNTRY = "[class='addressCountry form-control']";
    public static final String WORK_EMAIL_INPUT = "#email";
    public static final String ORGANIZATION_INPUT = "#organization";
    public static final String EXPECTED_USERS = "#users";
    public static final String CHECKBOX_AGREE = "#tos";
    public static final String BUTTON_CREATE_TESTRAIL_TRAIL = "[class='btn btn-success']";
    public static final String VERIFY_TEXT = "#email-confirm";

    public void openHomePage() {
        open(HOME_PAGE);
    }

    public void enterValue(String address) {
        webAddressInput.sendKeys(address);
    }//правильно так или через $

    public void enterFirstName(String firstName) {
        $(FIRST_NAME_INPUT).sendKeys(firstName);
    }

    public void enterLasttName(String lastName) {
        $(LAST_NAME_INPUT).setValue( lastName);
    }

    public void chooseCountry(String country) {
        $(YOUR_COUNTRY).selectOption(country);
       // $(YOUR_COUNTRY).getSelectedText();
    }

    public void enterWorkEmail(String workEmail) {
        $(WORK_EMAIL_INPUT).sendKeys(workEmail);
    }

    public void enterOrganization(String organization) {
        $(ORGANIZATION_INPUT).sendKeys(organization);
    }

    public void chooseAValue() {
        $(EXPECTED_USERS).selectOptionByValue();
    }

    public void chooseAgree() {
        $(CHECKBOX_AGREE).click();
    }

    public void clickButtonForFree() {
        $(BUTTON_CREATE_TESTRAIL_TRAIL).click();
    }

    public void verify(String someText) {
        $(VERIFY_TEXT).shouldHave(text(someText));
    }
}
