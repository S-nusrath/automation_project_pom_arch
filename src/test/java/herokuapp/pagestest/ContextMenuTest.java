package pagetest;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.ContextMenuPage;

public class ContextMenuTest extends BaseTest {

    @Test
    public void testContextMenu() {
        try {
            ContextMenuPage page = new ContextMenuPage(driver);
            page.openPage();
            page.rightClick();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
