package ������;

public class �迭������ extends Thread {
	public void run() {
		String[] s = {"Ŀ��", "��", "����", "����", "����"};
		for (int i = 0; i < s.length; i++) {
			System.out.println("�����̸�>>" + s[i]);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
