package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage {
    WebDriver driver;

    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        try {
            driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void drag() {
        try {
            WebElement a = driver.findElement(By.id("column-a"));
            WebElement b = driver.findElement(By.id("column-b"));
            new Actions(driver).dragAndDrop(a, b).perform();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
