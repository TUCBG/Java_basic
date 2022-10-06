package 상속활용;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 스레드사용2 extends JFrame{
	스레드1 t1 = new 스레드1();
	스레드2 t2 = new 스레드2();
	
	static int count;
	
	public 스레드사용2() {
		setSize(400, 400);		
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setVisible(true);
		t1.start();
		t2.start();
	}
	
	public static void main(String[] args) {
		스레드사용2 th2 = new 스레드사용2();
	}
	
	public class 스레드1 extends Thread{
		public void run() {
			for (int i = 0; i < 10; i++) {
				JButton btn = new JButton(i +"번 버튼");
				add(btn);
			}
		}
	}
	
	public class 스레드2 extends Thread{
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("!@");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
