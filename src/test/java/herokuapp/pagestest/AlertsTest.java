package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.AlertsPage;

public class AlertsTest extends BaseTest {

    @Test
    public void verifyAlertAccept() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        AlertsPage page = new AlertsPage(driver);
        page.acceptAlert();
    }
}
