import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase extends Settings{



    WebDriver driver;

    @BeforeTest
    public void setup() throws Exception {
        if (browser.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--kiosk");
            options.addArguments("--start-fullscreen");
            driver = new ChromeDriver(options);
        } else if (browser.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--kiosk");
            options.addArguments("--start-fullscreen");
            driver = new FirefoxDriver(options);

        } else if (browser.equals("Opera")) {
            WebDriverManager.operadriver().setup();
            OperaOptions options = new OperaOptions();
            options.addArguments("--kiosk");
            options.addArguments("--start-fullscreen");
            driver = new OperaDriver(options);
        }else {
            throw new Exception("Browser not found. Please select Chrome, Firefox or Opera");
        }
    }

    @AfterTest
    public void quit() {
        driver.quit();
    }
}
