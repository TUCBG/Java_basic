package ����ȯ;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ����ȯ�׷��� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setLayout(new FlowLayout());
		JButton b = new JButton("��ư");
		f.add(b);
		
		JLabel l = new JLabel("��");
		f.add(l);
		
		JTextField t = new JTextField();
		f.add(t);
		
		
		f.setVisible(true);
	}

}
