package pagetest;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.InputsPage;

public class InputsTest extends BaseTest {

    @Test
    public void testInputs() {
        try {
            InputsPage page = new InputsPage(driver);
            page.openPage();
            page.enterNumber();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
