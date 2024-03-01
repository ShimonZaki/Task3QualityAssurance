package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Ex3_a {

    @Test
    public void testPositiveX() {
        assertEquals(15, WeakClass.WeakMethod3(5, 10));
    }

    @Test
    public void testNegativeX() {
        assertEquals( -15, WeakClass.WeakMethod3(-5, 10));
    }
    /** (What will cover 100% Branch and expose the error)
    @Test(expected = ArithmeticException.class)
    public void testZeroX() {
        WeakClass.WeakMethod3(0, 10);
    }
    **/
}