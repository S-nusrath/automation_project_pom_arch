package pagetest;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.CheckBoxPage;

public class CheckBoxTest extends BaseTest {

    @Test
    public void testCheckBox() {
        try {
            CheckBoxPage page = new CheckBoxPage(driver);
            page.openPage();
            page.selectCheckbox();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
