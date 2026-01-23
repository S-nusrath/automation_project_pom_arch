package pagetest;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.MultipleWindowsPage;

public class MultipleWindowsTest extends BaseTest {

    @Test
    public void testMultipleWindows() {
        try {
            MultipleWindowsPage page = new MultipleWindowsPage(driver);
            page.openPage();
            page.openNewWindow();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
