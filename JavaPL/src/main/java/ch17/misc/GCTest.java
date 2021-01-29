package ch17.misc;

public class GCTest {
	public static void main(String[] args) {
		String[] arr = new String[10000];
		arr = null;
		Runtime rt = Runtime.getRuntime();
		System.out.println("Free memory before Garbage Collection = " + rt.freeMemory());
		rt.gc();
		System.out.println("Free memory after Garbage Collection = " + rt.freeMemory());
	}
}
