package pages;

import org.openqa.selenium.WebDriver;

public class ABTestingPage {
    WebDriver driver;

    public ABTestingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        try {
            driver.get("https://the-internet.herokuapp.com/abtest");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
