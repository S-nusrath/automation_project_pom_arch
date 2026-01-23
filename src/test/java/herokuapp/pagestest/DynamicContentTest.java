package pagetest;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.DynamicContentPage;

public class DynamicContentTest extends BaseTest {

    @Test
    public void testDynamicContent() {
        try {
            DynamicContentPage page = new DynamicContentPage(driver);
            page.openPage();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
