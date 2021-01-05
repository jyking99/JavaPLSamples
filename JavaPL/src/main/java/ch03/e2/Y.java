package ch03.e2;

public class Y extends X{
	protected int yMask = 0xff00;
	
	{
		System.out.printf("xMask=%x, yMask=%x, fullMask=%x\n", xMask, yMask, fullMask);
	}
	
	public Y() {
		fullMask |= yMask;
		System.out.printf("xMask=%x, yMask=%x, fullMask=%x\n", xMask, yMask, fullMask);
	}
	
	public static void main(String[] args) {
		new Y();
	}
}
