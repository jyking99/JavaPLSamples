package ch07.misc;

import java.util.Arrays;

public class PascalsTriangle {
	private final int depth = 20;
	private int[][] result = new int[depth][];
	
	public static void main(String[] args) {
		PascalsTriangle triangle = new PascalsTriangle();
		triangle.makeTriangle();
		triangle.show();
	}
	
	private void makeTriangle() {
		result[0] = new int[] {1};
		
		for (int i=1; i<depth; i++) {
			result[i] = makeRow(i);
		}
	}
	
	private int[] makeRow(int index) {
		int[] row = new int[index+1];
		
		row[0] = 1;
		row[index] = 1;
		for (int i = 1; i<index; i++) {
			row[i] = result[index-1][i-1] + result[index-1][i];
		}
		
		return row;
	}
	
	private void show() {
		for (int[] row : result) {
			System.out.println(Arrays.toString(row));
		}
	}
}
 