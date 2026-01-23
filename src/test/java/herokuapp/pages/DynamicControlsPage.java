package pages;

import org.openqa.selenium.*;

public class DynamicControlsPage {
    WebDriver driver;

    public DynamicControlsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        try {
            driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void clickRemove() {
        try {
            driver.findElement(By.xpath("//button[text()='Remove']")).click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
