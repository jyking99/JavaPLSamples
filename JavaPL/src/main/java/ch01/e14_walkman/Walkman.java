package ch01.e14_walkman;

import java.util.Arrays;

/**
 * ���K���1.14
 */
class Walkman {
	static int nextSerial = 0;
	private static final int capacity = 5; // �S�[�����ʂŁA�Œ肳��Ă���͂�
	
	{
		nextSerial ++;
	}
	
	private int serialNumber;
	private String owner;
	private Music[] lib = new Music[capacity];
	
	public Walkman(String owner) {
		serialNumber = nextSerial;
		this.owner = owner;
	}
	
	public int getSerial() {
		return serialNumber;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public void add(String title, String artist) {
		Music m = new Music(title, artist);
		int index = findNull();
		if (index == -1) {
			System.out.println("Storage full.");
			return;
		}
		lib[index] = m;
		System.out.println("Successfully added.");
	}
	
	public void remove(String title) {
		for (int i=0; i<capacity; i++) {
			if (lib[i].title == title) {
				lib[i] = null;
				if (i != capacity-1) {
					align();
				}
				return;
			}
		}
	}
	
	private void align() {
		for (int i=findNull(); i<capacity-1; i++) {
			if (lib[i+1] == null) {
				break;
			}
			lib[i] = lib[i+1];
		}
		lib[capacity-1] = null;
	}
	
	private int findNull() {
		for (int i=0; i<capacity; i++) {
			if (lib[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
	public String toString() {
		return owner + "'s Walkman. Content: " + Arrays.toString(lib);
	}
}
