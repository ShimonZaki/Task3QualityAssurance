package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class WeakClass {
	
	public static int WeakMethod1(int a, int b){
		int c;
		if(a<b) {
			c=b/a;
		}
		else if (a>b){
			c=a;
		}
		else {
			c=0;
		}
		return c;
	}
	
	 public static int WeakMethod2(int a, int b) {
	        if (a == 5) {
	            return b / 0; 
	        } else if (a < b) {
	            return b - a;
	        } else {
	            return a + b;
	        }
	    }
	 public static int WeakMethod3(int x, int y) {
		    if (x == 0) {
		        return y / x; 
		    } else if (x > 0) {
		        return x + y;
		    } else {
		        return x - y;
		    }
		}
	    public static int weakMethod4(int x, int y) {
	        if (x > 0) {
	            return x + 10;  
	        } else if (x < -10) {
	            return x - 10; 
	        } else {
	            return 10 / 0; 
	        }
	    }
	}

