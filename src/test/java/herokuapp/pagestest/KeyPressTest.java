package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.KeyPressPage;

public class KeyPressTest extends BaseTest {

    @Test
    public void verifyKeyPress() {
        driver.get("https://the-internet.herokuapp.com/key_presses");
        KeyPressPage page = new KeyPressPage(driver);
        page.pressKey();
    }
}
