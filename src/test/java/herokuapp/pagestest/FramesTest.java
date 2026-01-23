package pagetest;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.FramesPage;

public class FramesTest extends BaseTest {

    @Test
    public void testFrames() {
        try {
            FramesPage page = new FramesPage(driver);
            page.openPage();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
