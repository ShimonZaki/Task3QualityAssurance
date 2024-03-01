package Statment_Brancch_coverage.Statment_Brancch_coverage;

/**
 * Hello world!
 *
 */
public class App 
{
	public static int Add (int a, int b) {
	 int result;	
	 
	
	 
	 if (b > a) {
	    b = b - a;
	    result= b;
	 }else if (a > b) {
		 b = a - b;
		 result= b;
	}else
	    result=0;
	 return result;
	}
}
