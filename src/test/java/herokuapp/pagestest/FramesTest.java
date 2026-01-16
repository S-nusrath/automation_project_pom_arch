package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.FramesPage;

public class FramesTest extends BaseTest {

    @Test
    public void verifyFrameSwitch() {
        driver.get("https://the-internet.herokuapp.com/iframe");
        FramesPage page = new FramesPage(driver);
        page.switchToFrame();
    }
}
