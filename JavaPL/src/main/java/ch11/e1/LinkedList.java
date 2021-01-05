package ch11.e1;

public class LinkedList<E> {
	private E item;
	private LinkedList next;
	
	/** ���K���2.7
	 * item�͋����ɂ���ׂ�
	 */
	public LinkedList(E item) {
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
	public void extend(E... objects) {
		LinkedList l = this;
		while (l.next != null) {
			l = l.next;
		}
		
		for (E e : objects) {
			l.next = new LinkedList(e);
			l = l.next;
		}
	}
	
	public static void main (String[] args) {
		LinkedList a = new LinkedList("Ronnie");
		a.next = new LinkedList("Jay");
	}
}
