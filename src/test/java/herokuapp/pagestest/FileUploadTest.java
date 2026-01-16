package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.FileUploadPage;

public class FileUploadTest extends BaseTest {

    @Test
    public void verifyFileUpload() {
        driver.get("https://the-internet.herokuapp.com/upload");
        FileUploadPage page = new FileUploadPage(driver);
        page.uploadFile("C:\\testfile.txt");
    }
}
