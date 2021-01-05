package ch09.misc;

public class InfinityTest {
	public static void main(String[] args) {
		float pinf = Float.POSITIVE_INFINITY;
		float ninf = Float.NEGATIVE_INFINITY;
		
		System.out.println("��+�� = " + (pinf+pinf));
		System.out.println("��-�� = " + (pinf-pinf));
		System.out.println("��*�� = " + (pinf*pinf));
		System.out.println("��/�� = " + (pinf/pinf));
		
		System.out.println("-��+(-��) = " + (ninf+ninf));
		System.out.println("(-��)*(-��) = " + (ninf*ninf));
		System.out.println("(-��)/(-��) = " + (ninf/ninf));
	}
}
