package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.ContextMenuPage;

public class ContextMenuTest extends BaseTest {

    @Test
    public void verifyRightClick() {
        driver.get("https://the-internet.herokuapp.com/context_menu");
        ContextMenuPage page = new ContextMenuPage(driver);
        page.rightClick();
    }
}
