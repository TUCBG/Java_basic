package 형변환;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 형변환그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setLayout(new FlowLayout());
		JButton b = new JButton("버튼");
		f.add(b);
		
		JLabel l = new JLabel("라벨");
		f.add(l);
		
		JTextField t = new JTextField();
		f.add(t);
		
		
		f.setVisible(true);
	}

}
