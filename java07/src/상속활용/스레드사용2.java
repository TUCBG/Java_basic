package ���Ȱ��;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ��������2 extends JFrame{
	������1 t1 = new ������1();
	������2 t2 = new ������2();
	
	static int count;
	
	public ��������2() {
		setSize(400, 400);		
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setVisible(true);
		t1.start();
		t2.start();
	}
	
	public static void main(String[] args) {
		��������2 th2 = new ��������2();
	}
	
	public class ������1 extends Thread{
		public void run() {
			for (int i = 0; i < 10; i++) {
				JButton btn = new JButton(i +"�� ��ư");
				add(btn);
			}
		}
	}
	
	public class ������2 extends Thread{
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
