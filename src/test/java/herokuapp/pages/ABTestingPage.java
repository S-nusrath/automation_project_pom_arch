package herokuapp.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class ABTestingPage {

    public ABTestingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "h3")
    private WebElement heading;

    public String getHeading() {
        return heading.getText();
    }
}
