package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FramesPage {

    private WebDriver driver;

    public FramesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void switchToFrame() {
        driver.switchTo().frame(0);
        driver.switchTo().defaultContent();
    }
}
