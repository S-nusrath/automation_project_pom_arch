package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TablesPage {

    public TablesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//table[@id='table1']//tr[2]/td[1]")
    private WebElement firstName;

    public String getName() {
        return firstName.getText();
    }
}
