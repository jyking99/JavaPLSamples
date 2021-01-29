package ch14.e3;

public class RunAdding implements Runnable {
	
	public RunAdding () {
	}
	
	public void run() {
		for (;;) {
			Counter.increment();
		}
	}
	
}
