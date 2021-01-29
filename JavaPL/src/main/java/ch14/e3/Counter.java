package ch14.e3;

public class Counter {
	private static int count;
	private static Object countLock = new Object();
	
	public static void increment() {
		synchronized(countLock) {
			count ++;
		}
	}
	
	public static void decrement() {
		synchronized(countLock) {
			count --;
		}
	}
	
	public static int getCount() {
		return count; 
	}
	
	public static void main(String[] args) {
		new Thread(new RunAdding()).start();
		new Thread(new RunAdding()).start();
		new Thread(new RunAdding()).start();
	}
}
