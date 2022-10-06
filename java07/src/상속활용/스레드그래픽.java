package 상속활용;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 스레드그래픽 extends JFrame{
	JLabel count, image, day;
	카운터스레드2 count2 = new 카운터스레드2();
	시각스레드2 day2 = new 시각스레드2();
	이미지스레드2 image2 = new 이미지스레드2();
	
	public 스레드그래픽() {
		getContentPane().setBackground(Color.black);
		setSize(800, 300);		
		count = new JLabel("카운터");
		image = new JLabel();
		day = new JLabel("시각");
		add(count, BorderLayout.WEST);
		add(image, BorderLayout.EAST);
		add(day, BorderLayout.SOUTH);
		setVisible(true);
		count2.start();
		day2.start();
		image2.start();
	}
	
	public static void main(String[] args) {
		스레드그래픽 그래픽 = new 스레드그래픽();
		
	}
	
	public class 시각스레드2 extends Thread {
		public void run() {
			for (int i = 500; i > 0; i--) {
				Date date = new Date();
				day.setText("시각 >> " + date);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public class 카운터스레드2 extends Thread {
		public void run() {
			for (int i = 5; i >= 0; i--) {
				count.setText("카운트 >> " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} if (i == 0) {
					JOptionPane.showMessageDialog(null, "퇴장");
					image2.stop();
					day2.stop();
					
					//int hour = Calendar.HOUR;
					
				}
			}
		}
	}
	
	public class 이미지스레드2 extends Thread {
		public void run() {
			String[] list = {"1.png", "2.png", "3.png", "4.png", "5.png"};
			
			for (int i = 0; list.length > 0; i++) {
				// image.setText("이미지 >> " + list[i]);
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
