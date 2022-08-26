import org.testng.annotations.Test;

public class TestCases extends TestBase {

    @Test
    public void monthlyPriceCheck() {
        PricingTest monthlyPrice = new PricingTest(driver);
        monthlyPrice.chekingMonthlyPrice();
    }

}
