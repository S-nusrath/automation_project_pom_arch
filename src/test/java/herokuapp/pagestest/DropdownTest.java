package pagetest;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.DropdownPage;

public class DropdownTest extends BaseTest {

    @Test
    public void testDropdown() {
        try {
            DropdownPage page = new DropdownPage(driver);
            page.openPage();
            page.selectOption();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
