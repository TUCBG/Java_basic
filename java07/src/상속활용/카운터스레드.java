package ���Ȱ��;

import javax.swing.JOptionPane;

public class ī���ͽ����� extends Thread {
	public void run() {
		for (int i = 5; i >= 0; i--) {
			System.out.println("ī��Ʈ >> " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} if (i == 0) {
				JOptionPane.showMessageDialog(null, "����");
			}
		}
	}
}
