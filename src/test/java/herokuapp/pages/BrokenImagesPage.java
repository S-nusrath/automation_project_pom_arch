package pages;

import org.openqa.selenium.WebDriver;

public class BrokenImagesPage {
    WebDriver driver;

    public BrokenImagesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        try {
            driver.get("https://the-internet.herokuapp.com/broken_images");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
