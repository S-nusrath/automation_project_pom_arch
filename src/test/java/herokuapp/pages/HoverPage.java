package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    WebDriver driver;

    public HoverPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        try {
            driver.get("https://the-internet.herokuapp.com/hovers");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void hoverImage() {
        try {
            WebElement img = driver.findElement(By.className("figure"));
            new Actions(driver).moveToElement(img).perform();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
