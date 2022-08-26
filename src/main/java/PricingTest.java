import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Locale;

public class PricingTest extends Elements{

    public PricingTest(WebDriver driver) {
        this.driver = driver;
        driver.get(baseUrl);
        PageFactory.initElements(driver, this);
    }

    public void chekingMonthlyPrice() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 5);
        Assert.assertEquals("https://obss.tech/tr/", driver.getCurrentUrl());
        logger.info("Home Page opened successfully.");
        clickAndLog(cookieAcceptance);
        clickAndLog(products);
        clickAndLog(atlassianApps);
        switchTabs();
        elementContainsText(vendorName,"OBSS");
        clickAndLog(timeInStatus);
        clickAndLog(pricingTab);
        attributeEqualsAssertion(pricingType,"MONTHLY","value");

    }

    public void clickAndLog(WebElement webElement){
        visibilityOfElement(webElement);
        logger.info("Button found.");
        webElement.click();
        logger.info("Button is clicked.");
    }

    public void switchTabs(){
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));
        logger.info("Tabs switched");
    }

    public void elementContainsText(WebElement webElement, String text){
        visibilityOfElement(webElement);
        Assert.assertTrue(webElement.getText().contains(text));
        logger.info("Element contains text "+ text );
    }

    public void attributeEqualsAssertion(WebElement webElement, String expectedText, String attributeName){
        visibilityOfElement(webElement);
        Assert.assertEquals(expectedText , webElement.getAttribute(attributeName));
        logger.info( "Attribute " + attributeName + "includes " + expectedText );
    }

    public void visibilityOfElement(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(webElement));
        logger.info("Element is visible");
    }

}
