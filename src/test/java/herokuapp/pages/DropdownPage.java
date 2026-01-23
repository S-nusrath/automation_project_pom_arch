package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
    WebDriver driver;

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        try {
            driver.get("https://the-internet.herokuapp.com/dropdown");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void selectOption() {
        try {
            Select s = new Select(driver.findElement(By.id("dropdown")));
            s.selectByIndex(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
