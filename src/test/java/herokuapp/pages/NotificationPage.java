package pages;

import org.openqa.selenium.*;

public class NotificationPage {
    WebDriver driver;

    public NotificationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        try {
            driver.get("https://the-internet.herokuapp.com/notification_message_rendered");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void clickLink() {
        try {
            driver.findElement(By.linkText("Click here")).click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
