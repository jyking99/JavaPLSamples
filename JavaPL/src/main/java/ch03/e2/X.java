package ch03.e2;

public class X {
	protected int xMask = 0x00ff;
	protected int fullMask;
	
	{
		System.out.printf("xMask=%x, fullMask=%x\n", xMask, fullMask);
	}
	
	public X() {
		fullMask = xMask;
		System.out.printf("xMask=%x, fullMask=%x\n", xMask, fullMask);
	}
	
	public int mask(int orig) {
		return (orig & fullMask);
	}
}
