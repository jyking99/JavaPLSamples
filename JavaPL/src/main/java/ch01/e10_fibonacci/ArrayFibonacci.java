package ch01.e10_fibonacci;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayFibonacci {
	static ArrayList list = new ArrayList<Number>();
	static final String title = "Fibonacci";
	
	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;
		
		System.out.println(title);
		
		list.add(new Number(hi));
		while (hi < 50) {
			list.add(new Number(hi));
			hi = lo + hi;
			lo = hi - lo;
		}
		
		System.out.println(Arrays.toString(list.toArray()));
	}
}
