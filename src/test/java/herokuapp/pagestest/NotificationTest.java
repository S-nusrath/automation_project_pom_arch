package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.NotificationPage;

public class NotificationTest extends BaseTest {

    @Test
    public void verifyNotification() {
        driver.get("https://the-internet.herokuapp.com/notification_message_rendered");
        NotificationPage page = new NotificationPage(driver);
        page.clickNotification();
    }
}
