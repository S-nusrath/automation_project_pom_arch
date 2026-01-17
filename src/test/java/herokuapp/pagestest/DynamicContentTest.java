package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.DynamicContentPage;

public class DynamicContentTest extends BaseTest {

    @Test
    public void verifyDynamicContent() {
        driver.get("https://the-internet.herokuapp.com/dynamic_content");
        DynamicContentPage page = new DynamicContentPage(driver);
        page.refreshPage();
    }
}
