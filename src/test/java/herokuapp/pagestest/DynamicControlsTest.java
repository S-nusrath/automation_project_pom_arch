package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.DynamicControlsPage;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void verifyDynamicControls() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        DynamicControlsPage page = new DynamicControlsPage(driver);
        page.clickRemove();
    }
}
