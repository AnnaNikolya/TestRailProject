package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BasePage {
    WebDriver driver;

    BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id='et_builder_outer_content']/div/div/div[1]/div/div[1]/div/div/p[2]/a")
            private WebElement button;
            public void clickButton(){button.click();}

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div//form/div[8]")
    private WebElement buttonTCreateTestRailTrial;
    public void buttonSignUp(){buttonTCreateTestRailTrial.click();}
}

