package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Ex1_a {
	
	@Test(expected=ArithmeticException.class)
		public void b_bigger_than_a(){
	        int a = 0;
	        int b = 4;
	        WeakClass.WeakMethod1(a, b);
	}
}