package pages;

import org.openqa.selenium.*;

public class KeyPressPage {
    WebDriver driver;

    public KeyPressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        try {
            driver.get("https://the-internet.herokuapp.com/key_presses");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void pressKey() {
        try {
            driver.findElement(By.id("target")).sendKeys(Keys.ENTER);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
