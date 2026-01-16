package herokuapp.basetest;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import herokuapp.utility.DriverFactory;
import herokuapp.utility.ConfigReader;

public class BaseTest {

    protected WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void setUp(@org.testng.annotations.Optional("chrome") String browser) {
        Reporter.log(browser, true);
        DriverFactory.initDriver(browser);
        driver = DriverFactory.getDriver();
        driver.get(ConfigReader.get("base.url"));
    }

    @AfterMethod
    public void tearDown() {
        Reporter.log("Closing browser", true);
        DriverFactory.quitDriver();
    }
}
