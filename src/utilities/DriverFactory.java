package utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

class DriverFactory {
	
	private static String localpath	= System.getProperty("user.dir");

    static WebDriver driver = null;

    static WebDriver createInstance (String browserName) {
        WebDriver driver = null;


        if (browserName.toLowerCase().contains("firefox")) {
            driver = new FirefoxDriver();
            return driver;
        }
        if (browserName.toLowerCase().contains("safari")) {
            driver = new SafariDriver();
            return driver;
        }

        if (browserName.toLowerCase().contains("chrome")) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            DesiredCapabilities chromeDesiredCapabilities = DesiredCapabilities.chrome();
            driver = new ChromeDriver(chromeDesiredCapabilities);
            return driver;
        }
        return driver;
    }


	public static String getDriver(String key)
	{
		return localpath + System.getProperty("file.separator") + key;
	}
}