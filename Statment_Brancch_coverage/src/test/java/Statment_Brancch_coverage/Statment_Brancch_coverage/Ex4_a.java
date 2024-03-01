package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ex4_a {

    @Test
    public void testPositiveX() {
        assertEquals("Testing x > 0", 15, WeakClass.weakMethod4(5, 0));
    }

    @Test
    public void testVeryNegativeX() {
        assertEquals("Testing x < -10", -21, WeakClass.weakMethod4(-11, 0));
    }
}