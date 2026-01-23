package pagetest;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.DynamicControlsPage;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void testDynamicControls() {
        try {
            DynamicControlsPage page = new DynamicControlsPage(driver);
            page.openPage();
            page.clickRemove();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
