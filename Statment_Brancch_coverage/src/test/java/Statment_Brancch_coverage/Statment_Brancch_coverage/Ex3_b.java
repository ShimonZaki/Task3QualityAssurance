package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Ex3_b {

    @Test
    public void testPositiveX() {
        assertEquals(15, WeakClass.WeakMethod3(5, 10));
    }

    @Test
    public void testNegativeX() {
        assertEquals(-15, WeakClass.WeakMethod3(-5, 10));
    }
    //The diffrence beetween 3a and 3b
    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        WeakClass.WeakMethod3(0, 10); // This should trigger the division by zero error
    }
}
