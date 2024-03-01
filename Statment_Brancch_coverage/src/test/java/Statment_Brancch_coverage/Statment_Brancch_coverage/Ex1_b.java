package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Ex1_b {
	
	 @Test
		public void b_bigger_than_a(){
	        int a = 1;
	        int b = 5;

	        int expected =5;
	        int result = WeakClass.WeakMethod1(a, b);
	        assertEquals(expected, result,0.001);
	        
	    }
	 @Test
	 public void a_bigger_than_b(){
	        int a = 5;
	        int b = 4;

	        int expected =5;
	        int result = WeakClass.WeakMethod1(a, b);
	        assertEquals(expected, result,0.001);
	        
	    }
	 @Test
	 public void a_equal_b(){
	        int a = 5;
	        int b = 5;

	        int expected =0;
	        int result = WeakClass.WeakMethod1(a, b);
	        assertEquals(expected, result,0.001);
	 }
}