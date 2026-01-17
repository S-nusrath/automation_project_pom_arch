package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.MultipleWindowsPage;

public class MultipleWindowsTest extends BaseTest {

    @Test
    public void verifyMultipleWindows() {
        driver.get("https://the-internet.herokuapp.com/windows");
        MultipleWindowsPage page = new MultipleWindowsPage(driver);
        page.clickLink();
    }
}
