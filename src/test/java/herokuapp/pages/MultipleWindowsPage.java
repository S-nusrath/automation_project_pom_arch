package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MultipleWindowsPage {

    private WebDriver driver;

    public MultipleWindowsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLink() {
        driver.findElement(org.openqa.selenium.By.linkText("Click Here")).click();
    }
}
