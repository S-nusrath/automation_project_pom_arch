package pagetest;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.ABTestingPage;

public class ABTestingTest extends BaseTest {

    @Test
    public void testABTesting() {
        try {
            ABTestingPage page = new ABTestingPage(driver);
            page.openPage();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
