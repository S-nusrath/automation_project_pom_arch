package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoverPage {

    private WebDriver driver;

    public HoverPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "figure")
    private WebElement image;

    public void hoverImage() {
        new Actions(driver).moveToElement(image).perform();
    }
}
