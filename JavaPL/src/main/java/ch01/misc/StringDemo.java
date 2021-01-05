package ch01.misc;

/**
 * ���K���1.11
 */
public class StringDemo {
	public static void main(String[] args) {
		String myName = "jy";
		String occupation = "student";
		
		myName += " king";
		myName += " ";
		myName += "(" + occupation + ")";
		System.out.println(myName);
	}
}
