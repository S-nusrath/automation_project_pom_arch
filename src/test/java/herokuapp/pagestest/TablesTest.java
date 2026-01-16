package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.TablesPage;

public class TablesTest extends BaseTest {

    @Test
    public void verifyTableText() {
        driver.get("https://the-internet.herokuapp.com/tables");
        TablesPage page = new TablesPage(driver);
        Assert.assertNotNull(page.getName());
    }
}
