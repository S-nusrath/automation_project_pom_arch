package pages;

import org.openqa.selenium.WebDriver;

public class FramesPage {
    WebDriver driver;

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        try {
            driver.get("https://the-internet.herokuapp.com/frames");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
