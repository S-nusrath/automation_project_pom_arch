package pagetest;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.HoverPage;

public class HoverTest extends BaseTest {

    @Test
    public void testHover() {
        try {
            HoverPage page = new HoverPage(driver);
            page.openPage();
            page.hoverImage();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
