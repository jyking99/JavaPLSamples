package ch01.misc;

/**
 * ���K���1.3
 */
public class ConstFibonacci {
	static final String title = "Fibonacci";
	
	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;
		
		System.out.println(title);
		
		System.out.println(lo);
		while (hi < 50) {
			System.out.println(hi);
			hi = lo + hi;
			lo = hi - lo;
		}
	}
}
