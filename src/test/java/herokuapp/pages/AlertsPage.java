package pages;

import org.openqa.selenium.*;

public class AlertsPage {
    WebDriver driver;

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        try {
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void handleAlert() {
        try {
            driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
