package herokuapp.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class CheckBoxPage {

    public CheckBoxPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="(//input[@type='checkbox'])[1]")
    private WebElement checkbox;

    public void click() {
        checkbox.click();
    }

    public boolean isSelected() {
        return checkbox.isSelected();
    }
}
