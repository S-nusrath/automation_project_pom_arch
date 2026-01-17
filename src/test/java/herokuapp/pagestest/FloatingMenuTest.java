package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.FloatingMenuPage;

public class FloatingMenuTest extends BaseTest {

    @Test
    public void verifyFloatingMenu() {
        driver.get("https://the-internet.herokuapp.com/floating_menu");
        FloatingMenuPage page = new FloatingMenuPage(driver);
        System.out.println(page.isMenuDisplayed());
    }
}
