package pagetest;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.FileUploadPage;

public class FileUploadTest extends BaseTest {

    @Test
    public void testFileUpload() {
        try {
            FileUploadPage page = new FileUploadPage(driver);
            page.openPage();
            page.uploadFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
