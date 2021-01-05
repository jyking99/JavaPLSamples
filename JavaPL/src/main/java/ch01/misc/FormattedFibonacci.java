package ch01.misc;

/**
 * ���K���1.13
 */
public class FormattedFibonacci {
	static final String title = "Fibonacci";
	
	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;
		
		System.out.println(title);
		
		System.out.printf("%d, ", lo);
		while (hi < 50) {
			System.out.printf("%d, ", hi);
			hi = lo + hi;
			lo = hi - lo;
		}
	}
}
