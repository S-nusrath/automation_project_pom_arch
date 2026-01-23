package pages;

import org.openqa.selenium.WebDriver;

public class TablesPage {
    WebDriver driver;

    public TablesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        try {
            driver.get("https://the-internet.herokuapp.com/tables");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
