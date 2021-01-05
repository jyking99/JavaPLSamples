package ch03.e1;

/** 
 * ���K���2.1
 */
public class Vehicle {
	private static int nextID = 0;
	
	{
		nextID++;
	}
	
	private double speed;
	private double angle;
	private String owner;
	
	/** ���K���2.4
	 * ��������͕ύX����K�v���Ȃ��̂ŁAfinal�ɂ���ׂ��B
	 */
	private final int id = nextID;
	
	/** ���K���2.7
	 * �R���X�g���N�^
	 */
	public Vehicle(String owner) {
		this.owner = owner;
	}
	
	public Vehicle() {
	}
	
	/** ���K���2.9
	 * ���܂łōő��ID��Ԃ����\�b�h
	 */
	public static int maxID() {
		return nextID;
	}
	
	/** ���K���2.13
	 * �t�B�[���h�͓ǂݎ��݂̂ɂ���ׂ�
	 */
	public String getOwner() {
		return owner;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public double getAngle() {
		return angle;
	}
	
	/** ���K���2.10
	 */
	public String toString() {
		return owner + "'s vehicle";
	}
	
	/** ���K���2.12
	 * �ϒ��̕ϐ����󂯎�郁�\�b�h�͕K�v�Ȃ�
	 */
	
	public static void main(String[] args) {
		Vehicle a = new Vehicle("Steve");
		Vehicle b = new Vehicle("Alex");
		System.out.println(a);
		System.out.println(b);
	}
}
