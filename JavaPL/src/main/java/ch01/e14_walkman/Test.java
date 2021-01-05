package ch01.e14_walkman;

public class Test {
	public static void main(String[] args) {
		Walkman wk = new Walkman("jy");
		
		wk.add("It's my life", "Bon Jovi");
		wk.add("Always", "Bon Jovi");
		wk.add("Sakura", "Ikimono gakari");
		wk.add("Straw", "Aiko");
		wk.add("Erotika Seven", "Keisuke Kuwata");
		wk.add("error", "error");
		
		System.out.println(wk);
		
		wk.remove("Always");
		System.out.println(wk);
		
		wk.add("Watagashi", "Back Number");
		System.out.println(wk);
	}
}
