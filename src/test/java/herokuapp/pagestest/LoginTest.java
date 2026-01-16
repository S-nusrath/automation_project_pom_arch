package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {
        driver.get("https://the-internet.herokuapp.com/login");
        LoginPage page = new LoginPage(driver);
        page.login("tomsmith", "SuperSecretPassword!");
    }
}
