package ������;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class �����ڿ����ε� {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JFrame f2 =new  JFrame("���� ����");
		
		JButton b = new JButton();
		JButton b2 = new JButton("�ȳ��ϼ���");
		
		Font font = new Font("�ü�", 1, 50);
		b2.setFont(font);
		
		f2.add(b2);
		
		f2.setSize(400,400);
		f2.setVisible(true);
	}
}
