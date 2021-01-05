package ch09.misc;

public class BitCount {
	public static int count(int i) {
		int result = 0;
		
		while (i != 0) {
			if (i%2 == 1) {
				result++;
			}
			i = i >>> 1;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int a = 12345; 
		  
        // Convert integer number to binary  format 
        System.out.println(Integer.toBinaryString(a));
        
        System.out.println(count(a));
  
        // to print number of 1's in the number a 
        System.out.println(Integer.bitCount(a));
	}
}
