package pagetest;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.NotificationPage;

public class NotificationTest extends BaseTest {

    @Test
    public void testNotification() {
        try {
            NotificationPage page = new NotificationPage(driver);
            page.openPage();
            page.clickLink();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
