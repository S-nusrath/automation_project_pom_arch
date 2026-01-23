package pages;

import org.openqa.selenium.*;

public class MultipleWindowsPage {
    WebDriver driver;

    public MultipleWindowsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        try {
            driver.get("https://the-internet.herokuapp.com/windows");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void openNewWindow() {
        try {
            driver.findElement(By.linkText("Click Here")).click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
