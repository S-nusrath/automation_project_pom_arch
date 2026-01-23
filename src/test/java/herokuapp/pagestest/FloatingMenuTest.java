package pagetest;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.FloatingMenuPage;

public class FloatingMenuTest extends BaseTest {

    @Test
    public void testFloatingMenu() {
        try {
            FloatingMenuPage page = new FloatingMenuPage(driver);
            page.openPage();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
