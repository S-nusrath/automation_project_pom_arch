package herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage {

    private WebDriver driver;

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "file-upload")
    private WebElement chooseFile;

    @FindBy(id = "file-submit")
    private WebElement uploadBtn;

    public void uploadFile(String path) {
        chooseFile.sendKeys(path);
        uploadBtn.click();
    }
}
