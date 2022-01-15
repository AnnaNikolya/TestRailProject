package steps;
import com.codeborne.selenide.Configuration;

public class BaseSteps {
    public void init() {
        com.codeborne.selenide.Configuration.browser = "chrome";
        com.codeborne.selenide.Configuration.timeout = 30000;
        com.codeborne.selenide.Configuration.holdBrowserOpen = true;
        Configuration.headless = false;
    }
}
