package ch03.e10;

public class LinkedList implements Cloneable {
	private Object item;
	private LinkedList next;
	
	/** ���K���2.7
	 * item�͋����ɂ���ׂ�
	 */
	public LinkedList(Object item) {
		this.item = item;
	}
	
	/** ���K���2.11
	 */
	public String toString() {
		return item.toString();
	}
	
	/** ���K���2.12
	 * �ϒ��̈������Ƃ郁�\�b�h��LinkedList���g��
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
	
	public LinkedList clone() {
		return new LinkedList(this.item);
	}
	
	public static void main (String[] args) {
		LinkedList a = new LinkedList("Ronnie");
		a.next = new LinkedList("Jay");
	}
}
