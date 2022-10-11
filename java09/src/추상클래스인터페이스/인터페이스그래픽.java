package 추상클래스인터페이스;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class 인터페이스그래픽 implements ActionListener{
	static JButton btn1, btn2;
	static JTextArea ta;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		f.setLayout(new FlowLayout());
		
		btn1 = new JButton("눌러");
		btn2 = new JButton("나도");
		
		인터페이스그래픽 그래픽 = new 인터페이스그래픽();
		btn1.addActionListener(그래픽);
		btn2.addActionListener(그래픽);
		
		f.add(btn1); 
		f.add(btn2); 
		
		Font font = new Font("궁서", Font.BOLD, 50);
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
			ta.append("b1클릭함.\n");
			System.out.println("b1클릭함.");
		} else {
			ta.append("b2클릭함.\n");
			System.out.println("b2클릭함.");
		}
	}
}