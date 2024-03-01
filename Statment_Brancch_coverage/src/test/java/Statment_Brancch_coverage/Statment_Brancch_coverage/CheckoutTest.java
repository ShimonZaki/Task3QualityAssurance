package Statment_Brancch_coverage.Statment_Brancch_coverage;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CheckoutTest {

	   // Test case 1: Gold status with a cart value less than 3500 (approved)
    @Test
    public void testGoldStatusWithLowCart() {
        statusClass checkout = new statusClass();
        assertTrue("Gold status with a cart value < 3500 should be approved", 
                   checkout.checkOut(3000.00, 650, statusClass.Status.gold));
    }

    // Test case 2: Gold status with a cart value >= 3500 and credit rating <= 650 (not approved)
    @Test
    public void testGoldStatusWithHighCartLowCredit() {
        statusClass checkout = new statusClass();
        assertFalse("Gold status with a cart value >= 3500 and credit rating <= 650 should not be approved", 
                    checkout.checkOut(3500.00, 650, statusClass.Status.gold));
    }

    // Test case 3: Gold status with a cart value >= 3500 and credit rating > 650 (approved)
    @Test
    public void testGoldStatusWithHighCartHighCredit() {
        statusClass checkout = new statusClass();
        assertTrue("Gold status with a cart value >= 3500 and credit rating > 650 should be approved", 
                   checkout.checkOut(3500.00, 700, statusClass.Status.gold));
    }
 // Test case 4: Silver status with a cart value < 2500 (approved)
    @Test
    public void testSilverStatusWithLowCart() {
        statusClass checkout = new statusClass();
        assertTrue("Silver status with a cart value < 2500 should be approved", 
                   checkout.checkOut(2000.00, 650, statusClass.Status.silver));
    }

    // Test case 5: Silver status with a cart value >= 2500 and credit rating <= 750 (not approved)
    @Test
    public void testSilverStatusWithHighCartLowCredit() {
        statusClass checkout = new statusClass();
        assertFalse("Silver status with a cart value >= 2500 and credit rating <= 750 should not be approved", 
                    checkout.checkOut(2500.00, 750, statusClass.Status.silver));
    }

    // Test case 6: Silver status with a cart value >= 2500 and credit rating > 750 (approved)
    @Test
    public void testSilverStatusWithHighCartHighCredit() {
        statusClass checkout = new statusClass();
        assertTrue("Silver status with a cart value >= 2500 and credit rating > 750 should be approved", 
                   checkout.checkOut(2500.00, 800, statusClass.Status.silver));
    }

    // Test case 7: No status with a cart value < 1500 (approved)
    @Test
    public void testNoStatusWithLowCart() {
        statusClass checkout = new statusClass();
        assertTrue("No status with a cart value < 1500 should be approved", 
                   checkout.checkOut(1000.00, 650, null));
    }

    // Test case 8: No status with a cart value >= 1500 and credit rating <= 800 (not approved)
    @Test
    public void testNoStatusWithHighCartLowCredit() {
        statusClass checkout = new statusClass();
        assertFalse("No status with a cart value >= 1500 and credit rating <= 800 should not be approved", 
                    checkout.checkOut(1500.00, 800, null));
    }

    // Test case 9: No status with a cart value >= 1500 and credit rating > 800 (approved)
    @Test
    public void testNoStatusWithHighCartHighCredit() {
        statusClass checkout = new statusClass();
        assertTrue("No status with a cart value >= 1500 and credit rating > 800 should be approved", 
                   checkout.checkOut(1500.00, 850, null));
    }
}