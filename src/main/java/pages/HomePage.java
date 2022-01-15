package pages;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends BasePage {
    private SelenideElement buttonTryTest = $(By.xpath("//*[@id='et_builder_outer_content']//*[@class='btn btn-medium btn-green'][@role = 'button']"));
    String locator = "{behavior: \"instant\", block: \"center\", inline: \"center\"}";
    public void openHomePage() {open(HOME_PAGE);}
    public void clickButtonForFree() {this.buttonTryTest.scrollIntoView(locator).click();}
}