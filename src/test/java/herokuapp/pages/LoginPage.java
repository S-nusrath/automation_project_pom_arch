package pages;

import org.openqa.selenium.*;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        try {
            driver.get("https://the-internet.herokuapp.com/login");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void login() {
        try {
            driver.findElement(By.id("username")).sendKeys("tomsmith");
            driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
            driver.findElement(By.cssSelector("button")).click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
