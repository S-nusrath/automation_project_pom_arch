package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.DynamicLoadingPage;

public class DynamicLoadingTest extends BaseTest {

    @Test
    public void verifyDynamicLoading() {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
        DynamicLoadingPage page = new DynamicLoadingPage(driver);
        page.clickExample();
    }
}
