package ch01.misc;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ���K���1.9
 */
public class ArrayFibonacci {
	static final String title = "Fibonacci";
	static ArrayList list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;
		
		System.out.println(title);
		
		list.add(hi);
		while (hi < 50) {
			list.add(hi);
			hi = lo + hi;
			lo = hi - lo;
		}
		
		System.out.println(Arrays.toString(list.toArray()));
	}
}
