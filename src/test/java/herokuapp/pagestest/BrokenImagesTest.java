package pagetest;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.BrokenImagesPage;

public class BrokenImagesTest extends BaseTest {

    @Test
    public void testBrokenImages() {
        try {
            BrokenImagesPage page = new BrokenImagesPage(driver);
            page.openPage();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
