package pagetest;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.DragAndDropPage;

public class DragAndDropTest extends BaseTest {

    @Test
    public void testDragAndDrop() {
        try {
            DragAndDropPage page = new DragAndDropPage(driver);
            page.openPage();
            page.dragAndDrop();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
