package pages;

import org.openqa.selenium.WebDriver;

public class FloatingMenuPage {
    WebDriver driver;

    public FloatingMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        try {
            driver.get("https://the-internet.herokuapp.com/floating_menu");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
