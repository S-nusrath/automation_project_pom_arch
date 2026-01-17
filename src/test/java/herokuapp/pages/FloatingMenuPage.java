package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FloatingMenuPage {

    private WebDriver driver;

    public FloatingMenuPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isMenuDisplayed() {
        return driver.findElement(org.openqa.selenium.By.id("menu")).isDisplayed();
    }
}
