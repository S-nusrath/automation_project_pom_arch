package pagetest;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        try {
            LoginPage page = new LoginPage(driver);
            page.openPage();
            page.login();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
