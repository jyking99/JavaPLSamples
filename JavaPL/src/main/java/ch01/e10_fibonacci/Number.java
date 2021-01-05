package ch01.e10_fibonacci;

public class Number {
	private int value;
	private boolean even;
	
	public Number(int value) {
		this.value = value;
		this.even = value%2 == 0;
	}
	
	public String toString() {
		return "<" + value + ": " + even + ">";
	}
}
