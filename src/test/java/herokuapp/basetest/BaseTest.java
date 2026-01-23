// // package herokuapp.basetest;

// // import org.openqa.selenium.WebDriver;
// // import org.testng.Reporter;
// // import org.testng.annotations.AfterMethod;
// // import org.testng.annotations.BeforeMethod;
// // import org.testng.annotations.Parameters;

// // import herokuapp.utility.DriverFactory;
// // import herokuapp.utility.ConfigReader;

// // import org.testng.ITestResult;
// // import org.testng.annotations.AfterMethod;
// // import herokuapp.utility.ScreenshotUtil;


// // public class BaseTest {

// //     protected WebDriver driver;

// //     @Parameters("browser")
// //     @BeforeMethod
// //     public void setUp(@org.testng.annotations.Optional("chrome") String browser) {
// //         Reporter.log(browser, true);
// //         DriverFactory.initDriver(browser);
// //         driver = DriverFactory.getDriver();
// //         driver.get(ConfigReader.get("base.url"));
// //     }

// //     @AfterMethod
// //     public void tearDown() {
// //         Reporter.log("Closing browser", true);
// //         DriverFactory.quitDriver();
// //     }

// //     @AfterMethod
// // public void tearDown(ITestResult result) {

// //     if (ITestResult.FAILURE == result.getStatus()) {
// //         ScreenshotUtil.takeScreenshot(
// //             driver,
// //             result.getName(),
// //             "herokuapp"
// //         );
// //     }

// //     if (driver != null) {
// //         driver.quit();
// //     }
// // }

// // }


// package herokuapp.basetest;

// import org.openqa.selenium.WebDriver;
// import org.testng.ITestResult;
// import org.testng.Reporter;
// import org.testng.annotations.AfterMethod;
// import org.testng.annotations.BeforeMethod;
// import org.testng.annotations.Parameters;

// import herokuapp.utility.ConfigReader;
// import herokuapp.utility.DriverFactory;
// import herokuapp.utility.ScreenshotUtil;

// public class BaseTest {

//     protected WebDriver driver;

//     @Parameters("browser")
//     @BeforeMethod
//     public void setUp(@org.testng.annotations.Optional("chrome") String browser) {

//         Reporter.log("Browser: " + browser, true);

//         DriverFactory.initDriver(browser);
//         driver = DriverFactory.getDriver();

//         driver.get(ConfigReader.get("base.url"));
//     }

//     @AfterMethod
//     public void tearDown(ITestResult result) {

//         if (ITestResult.FAILURE == result.getStatus()) {
//             ScreenshotUtil.takeScreenshot(
//                     driver,
//                     result.getName(),
//                     "herokuapp"
//             );
//         }

//         Reporter.log("Closing browser", true);
//         DriverFactory.quitDriver();
//     }
// }


package herokuapp.basetest;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import herokuapp.listener.TestListener;
import herokuapp.utility.DriverFactory;
import herokuapp.utility.ConfigReader;

@Listeners(TestListener.class)
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
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
