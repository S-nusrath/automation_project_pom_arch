package pages;

import org.openqa.selenium.WebDriver;

public class DynamicContentPage {
    WebDriver driver;

    public DynamicContentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        try {
            driver.get("https://the-internet.herokuapp.com/dynamic_content");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
