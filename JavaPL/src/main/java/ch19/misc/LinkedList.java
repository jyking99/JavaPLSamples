package ch19.misc;

/**
 * 練習問題19.1, 19.2
 * An <code>LinkedList</code> object defines a list by linking objects together.
 * Each <code>LinkedList</code> object consists of an item/next pair, specifying its content 
 * and the next <code>LinekedList</code> object.
 * 
 * @author jy
 */
public class LinkedList {
	/** Content */
	private Object item;
	/** reference to next LinkedList element */
	private LinkedList next;
	
	/**
	 * Creates a new <code>LinkedList</code> containing the given item.
	 * @param item
	 */
	public LinkedList(Object item) {
		this.item = item;
	}
	
	/**
	 * Returns a string of the form <code>item</code>
	 */
	public String toString() {
		return item.toString();
	}
	
	/**
	 * Extends the <code>LinkedList</code> by chaining the given array of objects 
	 * to the existing list.
	 * @param objects
	 */
	public void extend(Object... objects) {
		LinkedList l = this;
		while (l.next != null) {
			l = l.next;
		}
		for (Object o : objects) {
			l.next = new LinkedList(o);
			l = l.next;
		}
	}
}
