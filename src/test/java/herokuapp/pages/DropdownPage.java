package herokuapp.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

    public DropdownPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="dropdown")
    private WebElement dropdown;

    public void select(String value) {
        new Select(dropdown).selectByVisibleText(value);
    }

    public String getSelected() {
        return new Select(dropdown).getFirstSelectedOption().getText();
    }
}
