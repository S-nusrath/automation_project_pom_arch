package herokuapp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class KeyPressPage {

    private WebDriver driver;

    public KeyPressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void pressKey() {
        driver.findElement(org.openqa.selenium.By.id("target")).sendKeys(Keys.ENTER);
    }
}
