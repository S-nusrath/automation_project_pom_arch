package pagetest;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.AlertsPage;

public class AlertsTest extends BaseTest {

    @Test
    public void testAlerts() {
        try {
            AlertsPage page = new AlertsPage(driver);
            page.openPage();
            page.handleAlert();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
