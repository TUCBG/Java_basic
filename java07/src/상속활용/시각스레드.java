package ���Ȱ��;

import java.util.Date;

public class �ð������� extends Thread {
	public void run() {
		for (int i = 500; i > 0; i--) {
			Date date = new Date();
			System.out.println("�ð� >> " + date);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
