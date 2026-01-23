package pages;

import org.openqa.selenium.*;

public class CheckBoxPage {
    WebDriver driver;

    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        try {
            driver.get("https://the-internet.herokuapp.com/checkboxes");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void clickCheckbox() {
        try {
            driver.findElement(By.xpath("//input[1]")).click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
