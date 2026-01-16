package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPage {

    private WebDriver driver;

    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "column-a")
    private WebElement source;

    @FindBy(id = "column-b")
    private WebElement target;

    public void dragAndDrop() {
        Actions act = new Actions(driver);
        act.dragAndDrop(source, target).perform();
    }
}
