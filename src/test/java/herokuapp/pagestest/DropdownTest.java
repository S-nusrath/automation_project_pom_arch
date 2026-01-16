package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.DropdownPage;

public class DropdownTest extends BaseTest {

    @Test
    public void verifyDropdown() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        DropdownPage page = new DropdownPage(driver);
        page.select("Option 1");
        Assert.assertEquals(page.getSelected(), "Option 1");
    }
}
