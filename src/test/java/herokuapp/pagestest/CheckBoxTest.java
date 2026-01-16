package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.CheckBoxPage;

public class CheckBoxTest extends BaseTest {

    @Test
    public void verifyCheckbox() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        CheckBoxPage page = new CheckBoxPage(driver);
        page.click();
        Assert.assertTrue(page.isSelected());
    }
}
