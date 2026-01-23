package pages;

import org.openqa.selenium.*;

public class InputsPage {
    WebDriver driver;

    public InputsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        try {
            driver.get("https://the-internet.herokuapp.com/inputs");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void enterNumber() {
        try {
            driver.findElement(By.tagName("input")).sendKeys("123");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
