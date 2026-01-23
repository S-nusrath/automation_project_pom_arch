package pagetest;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.TablesPage;

public class TablesTest extends BaseTest {

    @Test
    public void testTables() {
        try {
            TablesPage page = new TablesPage(driver);
            page.openPage();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
