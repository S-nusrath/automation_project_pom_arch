// package orangehrm.basetest;

// import org.openqa.selenium.WebDriver;
// import org.testng.annotations.AfterClass;
// import org.testng.annotations.AfterMethod;
// import org.testng.annotations.BeforeClass;
// import org.testng.annotations.BeforeMethod;
// import org.testng.annotations.Parameters;
// import orangehrm.configreader.ConfigReader;
// import orangehrm.driverfactory.DriverFactory;
// import org.testng.Reporter;
// import org.testng.ITestResult;
// import org.testng.annotations.AfterMethod;
// import herokuapp.utility.ScreenshotUtil;


// public class BaseTest {
// 	protected WebDriver driver;
// 	@BeforeClass
// 	public void beforeClass() {
// 		try {
// 		}catch(Exception e) {
// 			e.printStackTrace();
// 		}
// 	}
// 	@Parameters("browser")
// 	@BeforeMethod
// 	public void beforeMethod(@org.testng.annotations.Optional("chrome") String browser) {
// 		Reporter.log(browser,true);
// 		try {
// 			DriverFactory.initDriver(browser);
// 			DriverFactory.getDriver()
//             .get(ConfigReader.get("base.url"));
// 		}catch(Exception e) {
// 			e.printStackTrace();
// 		}
// 	}
// 	@AfterMethod
// 	public void afterMethod() {
// 		Reporter.log("Browser is closing",true);
// 		try {
// 			DriverFactory.quitDriver();
// 		}catch(Exception e) {
// 			e.printStackTrace();
// 		}
// 	}
// 	@AfterClass
// 	public void afterClass() {
// 	}
// }


package orangehrm.basetest;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import orangehrm.utility.ConfigReader;
import orangehrm.utility.DriverFactory;
import orangehrm.utility.ScreenshotUtil;

public class BaseTest {

    protected WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void setUp(@org.testng.annotations.Optional("chrome") String browser) {

        Reporter.log("Browser: " + browser, true);

        DriverFactory.initDriver(browser);
        driver = DriverFactory.getDriver();

        driver.get(ConfigReader.get("base.url"));
    }

    @AfterMethod
    public void tearDown(ITestResult result) {

        if (ITestResult.FAILURE == result.getStatus()) {
            ScreenshotUtil.takeScreenshot(
                    driver,
                    result.getName(),
                    "orangehrm"
            );
        }

        Reporter.log("Closing browser", true);
        DriverFactory.quitDriver();
    }
}
