package pages;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends BasePage{

    public HomePage openHomePage(String homePage){
       open();
        return this;
    }
}
