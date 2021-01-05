package ch01.misc;

/**
 * ���K���1.8
 */
public class Point {
	private double x;
	private double y;
	
	public void clear() {
		x = 0.0;
		y = 0.0;
	}
	
	public void move(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void move(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
}
