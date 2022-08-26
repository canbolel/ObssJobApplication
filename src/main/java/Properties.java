import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class Properties {
    WebDriver driver;
    final Logger logger = Logger.getLogger(String.valueOf(this.getClass()));
    //Giving a static link to Home page to start the processes.
    public static String baseUrl = "https://obss.tech/tr/";
}
