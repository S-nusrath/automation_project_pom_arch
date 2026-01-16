package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage {

    private WebDriver driver;

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='Click for JS Alert']")
    private WebElement alertBtn;

    public void acceptAlert() {
        alertBtn.click();
        driver.switchTo().alert().accept();
    }
}
