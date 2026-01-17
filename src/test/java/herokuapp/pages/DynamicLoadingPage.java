package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadingPage {

    private WebDriver driver;

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickExample() {
        driver.findElement(org.openqa.selenium.By.linkText("Example 1")).click();
    }
}
