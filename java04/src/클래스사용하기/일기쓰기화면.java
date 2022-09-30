package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;

public class 일기쓰기화면 {
	private static JTextField t1;
	private static JTextField t2;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void open(){
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 242, 181));
		f.getContentPane().setForeground(new Color(0, 0, 0));
		f.setSize(400,400);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel.setBounds(30, 30, 95, 35);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setForeground(new Color(0, 0, 0));
		t1.setBounds(137, 34, 181, 29);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 제목");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(30, 95, 95, 35);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setForeground(new Color(0, 0, 0));
		t2.setColumns(10);
		t2.setBounds(137, 95, 181, 29);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_1_1 = new JLabel("오늘의 내용");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(30, 220, 95, 35);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JTextArea ta = new JTextArea();
		ta.setForeground(new Color(0, 0, 0));
		ta.setBounds(137, 158, 181, 154);
		f.getContentPane().add(ta);
		
		JButton btnNewButton = new JButton("파일에 일기 저장");
		btnNewButton.setBackground(new Color(255, 204, 238));
		btnNewButton.setBounds(97, 322, 163, 29);
		f.getContentPane().add(btnNewButton);
		f.setVisible(true);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = ta.getText();
				
				try {
					FileWriter file = new FileWriter(s2 + ".txt");
					
					file.write(s1 + "\n");
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					
					file.close();
				} catch (IOException e1) {
					System.out.println("에러");
				}
				
			}
		});
	}
}
