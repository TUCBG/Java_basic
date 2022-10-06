package 상속활용;

import javax.swing.JOptionPane;

public class 카운터스레드 extends Thread {
	public void run() {
		for (int i = 5; i >= 0; i--) {
			System.out.println("카운트 >> " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} if (i == 0) {
				JOptionPane.showMessageDialog(null, "퇴장");
			}
		}
	}
}
