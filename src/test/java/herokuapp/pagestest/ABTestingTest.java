package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.ABTestingPage;

public class ABTestingTest extends BaseTest {

    @Test
    public void verifyABTest() {
        driver.get("https://the-internet.herokuapp.com/abtest");
        ABTestingPage page = new ABTestingPage(driver);
        Assert.assertTrue(page.getHeading().contains("A/B"));
    }
}
