package pagetest;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.DynamicLoadingPage;

public class DynamicLoadingTest extends BaseTest {

    @Test
    public void testDynamicLoading() {
        try {
            DynamicLoadingPage page = new DynamicLoadingPage(driver);
            page.openPage();
            page.clickStart();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
