package 생성자;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Color;

public class 음식주문프로그램 {
	static int count;
	static int jajangCount = 0;
	static int jjambbongCount = 0;
	static int udongCount = 0;
	
	static final int PRICE = 5000; //상수이기 때문에 final >> 변경불가
	private static JTextField t1;
	
	public static void main(String[] args) {
		String[] img = {"짜장.png", "짬뽕.png", "우동.png"};
		
		JFrame f = new JFrame("음식 주문 프로그램");
		f.getContentPane().setBackground(new Color(234, 28, 4));
		f.setSize(700, 605);
		f.getContentPane().setLayout(null);
		
		JLabel center = new JLabel("");
		center.setHorizontalAlignment(SwingConstants.CENTER);
		center.setIcon(new ImageIcon("C:\\Users\\CBG\\Desktop\\\uBC31\uC5D4\uB4DC\uACFC\uC815\\ECLIPSE\\java06\\\uBA54\uC778.png"));
		center.setBounds(100, 96, 473, 315);
		f.getContentPane().add(center);
		
		JLabel result = new JLabel("\uACB0\uC81C\uAE08\uC561");
		result.setForeground(new Color(255, 255, 0));
		result.setFont(new Font("굴림", Font.BOLD, 25));
		result.setBounds(100, 471, 473, 57);
		f.getContentPane().add(result);
		
		JLabel lblNewLabel_1 = new JLabel("\uAC1C\uC218");
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_1.setBounds(417, 14, 57, 55);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("굴림", Font.PLAIN, 25));
		t1.setForeground(new Color(255, 0, 0));
		t1.setBackground(new Color(255, 255, 0));
		t1.setBounds(465, 14, 169, 55);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btn1 = new JButton("\uC9DC\uC7A5\uBA74");
		btn1.setForeground(new Color(255, 0, 0));
		btn1.setBackground(new Color(255, 255, 0));
		btn1.setFont(new Font("굴림", Font.BOLD, 15));
		btn1.setBounds(12, 10, 97, 59);
		f.getContentPane().add(btn1);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				jajangCount++;
				f.setTitle("짜장 : " + jajangCount +"짬뽕 : "+jjambbongCount +"우동 : " + udongCount);
				t1.setText(count +"개");
				result.setText("결제금액 : " + (count * PRICE) + "원");
				
				ImageIcon jajang = new ImageIcon(img[0]);
				center.setIcon(jajang);
				
			}
		});
		
		JButton btn2 = new JButton("\uC9EC\uBF55");
		btn2.setForeground(new Color(255, 0, 0));
		btn2.setBackground(new Color(255, 255, 0));
		btn2.setFont(new Font("굴림", Font.BOLD, 15));
		btn2.setBounds(121, 10, 97, 59);
		f.getContentPane().add(btn2);
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				jjambbongCount++;
				f.setTitle("짜장 : " + jajangCount +"짬뽕 : "+jjambbongCount +"우동 : " + udongCount);
				t1.setText(count +"개");
				result.setText("결제금액 : " + (count * PRICE) + "원");
				
				ImageIcon jjambbong = new ImageIcon(img[1]);
				center.setIcon(jjambbong);
			}
		});
		
		JButton btn3 = new JButton("\uC6B0\uB3D9");
		btn3.setForeground(new Color(255, 0, 0));
		btn3.setBackground(new Color(255, 255, 0));
		btn3.setFont(new Font("굴림", Font.BOLD, 15));
		btn3.setBounds(230, 10, 97, 59);
		f.getContentPane().add(btn3);
		f.setVisible(true );
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				udongCount++;
				f.setTitle("짜장 : " + jajangCount +"짬뽕 : "+jjambbongCount +"우동 : " + udongCount);
				t1.setText(count +"개");
				result.setText("결제금액 : " + (count * PRICE) + "원");
				
				ImageIcon udong = new ImageIcon(img[2]);
				center.setIcon(udong);
			}
		});
	}
}
