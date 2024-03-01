package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Ex2_b {

	@Test
	public void testWeakMethod2_CaseALessThanB() {
	    int result = WeakClass.WeakMethod2(3, 5); // a < b
	    assertEquals(2, result); // Expecting b - a
	}

	@Test
	public void testWeakMethod2_CaseAGreaterThanB() {
	    int result = WeakClass.WeakMethod2(6, 5); // a > b and a != 5
	    assertEquals(11, result); // Expecting a + b
	}
}
