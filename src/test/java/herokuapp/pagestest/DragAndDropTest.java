package herokuapp.pagestest;

import org.testng.annotations.Test;
import herokuapp.basetest.BaseTest;
import herokuapp.pages.DragAndDropPage;

public class DragAndDropTest extends BaseTest {

    @Test
    public void verifyDragAndDrop() {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        DragAndDropPage page = new DragAndDropPage(driver);
        page.dragAndDrop();
    }
}
