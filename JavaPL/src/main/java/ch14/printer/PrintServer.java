package ch14.printer;

import java.awt.PrintJob;

/** ���K���14.2
 * �X���b�h����
 */
public class PrintServer implements Runnable {
	private final PrintQueue requests = new PrintQueue();
	
	public PrintServer() {
		new Thread(this, "constructorThread").start();
	}
	
	public void print(PrintJob job) {
		requests.add(job);
	}
	
	public void run() {
		if (Thread.currentThread().getName().equals("constructorThread")) {
			for (;;) {
				realPrint(requests.remove());
			}
		}
	}
	
	private void realPrint(PrintJob job) {
		// ����̎��ۂ̏���
		System.out.println("printing");
	}
}
