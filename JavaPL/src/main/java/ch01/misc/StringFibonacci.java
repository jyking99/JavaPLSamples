package ch01.misc;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ���K���1.12
 */
public class StringFibonacci {
	static final String title = "Fibonacci";
	static ArrayList list = new ArrayList<String>();
	
	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;
		
		System.out.println(title);
		
		list.add(lo);
		while (hi < 50) {
			list.add(lo);
			hi = lo + hi;
			lo = hi - lo;
		}
		
		System.out.println(Arrays.toString(list.toArray()));
	}
}
