package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NotificationPage {

    private WebDriver driver;

    public NotificationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickNotification() {
        driver.findElement(org.openqa.selenium.By.linkText("Click here")).click();
    }
}
