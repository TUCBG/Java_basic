package ���Ȱ��;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ������׷��� extends JFrame{
	JLabel count, image, day;
	ī���ͽ�����2 count2 = new ī���ͽ�����2();
	�ð�������2 day2 = new �ð�������2();
	�̹���������2 image2 = new �̹���������2();
	
	public ������׷���() {
		getContentPane().setBackground(Color.black);
		setSize(800, 300);		
		count = new JLabel("ī����");
		image = new JLabel();
		day = new JLabel("�ð�");
		add(count, BorderLayout.WEST);
		add(image, BorderLayout.EAST);
		add(day, BorderLayout.SOUTH);
		setVisible(true);
		count2.start();
		day2.start();
		image2.start();
	}
	
	public static void main(String[] args) {
		������׷��� �׷��� = new ������׷���();
		
	}
	
	public class �ð�������2 extends Thread {
		public void run() {
			for (int i = 500; i > 0; i--) {
				Date date = new Date();
				day.setText("�ð� >> " + date);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public class ī���ͽ�����2 extends Thread {
		public void run() {
			for (int i = 5; i >= 0; i--) {
				count.setText("ī��Ʈ >> " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} if (i == 0) {
					JOptionPane.showMessageDialog(null, "����");
					image2.stop();
					day2.stop();
					
					//int hour = Calendar.HOUR;
					
				}
			}
		}
	}
	
	public class �̹���������2 extends Thread {
		public void run() {
			String[] list = {"1.png", "2.png", "3.png", "4.png", "5.png"};
			
			for (int i = 0; list.length > 0; i++) {
				// image.setText("�̹��� >> " + list[i]);
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
