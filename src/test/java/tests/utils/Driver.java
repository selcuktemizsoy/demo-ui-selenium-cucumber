package tests.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public enum Driver {
    INSTANCE;
    private WebDriver driver;

    private Driver() {
    }

    public static WebDriver getInstance() {
        if (INSTANCE.driver == null) {
            switch (System.getenv("browser").toLowerCase()) {
                case "remote":
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    try {
                        INSTANCE.driver = new RemoteWebDriver(new URL(System.getenv("grid")), firefoxOptions);
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    INSTANCE.driver = new FirefoxDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    INSTANCE.driver = new ChromeDriver();
            }
        }

        return INSTANCE.driver;
    }

    public static void closeDriver() {
        if (Driver.getInstance() != null) {
            Driver.getInstance().close();
            Driver.INSTANCE.driver = null;
        }
    }
}
