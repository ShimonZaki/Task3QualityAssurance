package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Ex2_a{

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        WeakClass.WeakMethod2(5, 10); // 
    }
}