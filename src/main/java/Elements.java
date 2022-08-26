import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Elements extends Properties {

    @FindBy(how = How.ID, using="cookieAcceptance")
    public WebElement cookieAcceptance;

    @FindBy(how = How.ID, using="menu-item-6933")
    public WebElement products;

    @FindBy(how = How.XPATH, using="//li[@id = 'menu-item-6938']/a")
    public WebElement atlassianApps;

    @FindBy(how = How.XPATH, using="//span[text ()='Time in Status']")
    public WebElement timeInStatus;

    @FindBy(how = How.XPATH, using="//h1[contains(@class,'VendorDetailsHeader__vendorName--2F')]")
    public WebElement vendorName;

    @FindBy(how = How.ID, using="app-listing-tabs-2")
    public WebElement pricingTab;

    @FindBy(how = How.ID, using="bxpkit-switch-1")
    public WebElement pricingType;









}
