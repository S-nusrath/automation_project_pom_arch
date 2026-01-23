// package herokuapp.utility;

// import java.io.FileInputStream;
// import java.util.Properties;

// public class ConfigReader {

//     private static Properties prop = new Properties();

//     static {
//         try {
//             FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
//             prop.load(fis);
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }

//     public static String get(String key) {
//         return prop.getProperty(key);
//     }
// }


package utility;

public class ConfigReader {

    public static String getBrowser() {
        return "chrome";
    }
}
