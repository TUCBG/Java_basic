package �߻�Ŭ�����������̽�;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class �������̽��׷��� implements ActionListener{
	static JButton btn1, btn2;
	static JTextArea ta;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		f.setLayout(new FlowLayout());
		
		btn1 = new JButton("����");
		btn2 = new JButton("����");
		
		�������̽��׷��� �׷��� = new �������̽��׷���();
		btn1.addActionListener(�׷���);
		btn2.addActionListener(�׷���);
		
		f.add(btn1); 
		f.add(btn2); 
		
		Font font = new Font("�ü�", Font.BOLD, 50);
		btn1.setFont(font);
		btn2.setFont(font);
		
		ta = new JTextArea(6, 10);
		ta.setFont(font);
		f.add(ta);
		
		ta.setBackground(Color.blue);
		
		f.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			ta.append("b1Ŭ����.\n");
			System.out.println("b1Ŭ����.");
		} else {
			ta.append("b2Ŭ����.\n");
			System.out.println("b2Ŭ����.");
		}
	}
}