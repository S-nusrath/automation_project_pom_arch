package pages;

import org.openqa.selenium.*;

public class DynamicLoadingPage {
    WebDriver driver;

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        try {
            driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
