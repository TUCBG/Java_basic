package 스레드;

import java.util.Iterator;

public class 카운터스레드 extends Thread {
	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println("카운터>>" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
