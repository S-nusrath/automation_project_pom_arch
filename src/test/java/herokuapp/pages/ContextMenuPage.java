package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    WebDriver driver;

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        try {
            driver.get("https://the-internet.herokuapp.com/context_menu");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void rightClick() {
        try {
            WebElement box = driver.findElement(By.id("hot-spot"));
            new Actions(driver).contextClick(box).perform();
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
