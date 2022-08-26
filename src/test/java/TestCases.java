import org.testng.annotations.Test;

public class TestCases extends TestBase {

    @Test
    public void monthlyPriceCheck() throws InterruptedException {
        PricingTest monthlyPrice = new PricingTest(driver);
        monthlyPrice.chekingMonthlyPrice();
    }

}
