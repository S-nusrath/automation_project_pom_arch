package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.InputsPage;

public class InputsTest extends BaseTest {

    @Test
    public void verifyInput() {
        driver.get("https://the-internet.herokuapp.com/inputs");
        InputsPage page = new InputsPage(driver);
        page.enterNumber("123");
    }
}
