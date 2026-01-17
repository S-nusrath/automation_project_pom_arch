package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.BrokenImagesPage;

public class BrokenImagesTest extends BaseTest {

    @Test
    public void verifyBrokenImagesPage() {
        driver.get("https://the-internet.herokuapp.com/broken_images");
        BrokenImagesPage page = new BrokenImagesPage(driver);
        System.out.println(page.getPageTitle());
    }
}
