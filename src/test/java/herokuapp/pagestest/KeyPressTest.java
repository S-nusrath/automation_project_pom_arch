package pagetest;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.KeyPressPage;

public class KeyPressTest extends BaseTest {

    @Test
    public void testKeyPress() {
        try {
            KeyPressPage page = new KeyPressPage(driver);
            page.openPage();
            page.pressKey();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
