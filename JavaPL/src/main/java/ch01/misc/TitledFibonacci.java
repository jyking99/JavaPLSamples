package ch01.misc;

/**
 * ���K���1.3
 */
public class TitledFibonacci {
	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;
		System.out.println("Fibonacci");
		System.out.println(lo);
		while (hi < 50) {
			System.out.println(hi);
			hi = lo + hi;
			lo = hi - lo;
		}
	}
}
