package pages;

import org.openqa.selenium.*;

public class FileUploadPage {
    WebDriver driver;

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        try {
            driver.get("https://the-internet.herokuapp.com/upload");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void uploadFile() {
        try {
            driver.findElement(By.id("file-upload"))
                  .sendKeys("C:\\testfile.txt");
            driver.findElement(By.id("file-submit")).click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
