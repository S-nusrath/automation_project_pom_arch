package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.HoverPage;

public class HoverTest extends BaseTest {

    @Test
    public void verifyHover() {
        driver.get("https://the-internet.herokuapp.com/hovers");
        HoverPage page = new HoverPage(driver);
        page.hoverImage();
    }
}
