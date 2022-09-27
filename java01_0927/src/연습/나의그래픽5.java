package 연습;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 나의그래픽5 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(128, 255, 128));
		f.setSize(400,430);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고싶은 음식");
		lblNewLabel.setBounds(12, 31, 84, 34);
		f.getContentPane().add(lblNewLabel);
		
		
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 255, 0));
		t1.setBounds(108, 38, 264, 27);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton where = new JButton("어디로 갈까?");
		where.setBounds(22, 84, 350, 40);
		f.getContentPane().add(where);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setBounds(12, 134, 84, 34);
		f.getContentPane().add(lblNewLabel_1);
		
		where.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s1 = t1.getText();
				if (s1.equals("커피")) {
					JOptionPane.showMessageDialog(f, "카페에 가세요");
				}else {
					JOptionPane.showMessageDialog(f, "물이나 마셔요");
				}
			}
		});
		
		t2 = new JTextField();
		t2.setBackground(new Color(255, 128, 255));
		t2.setColumns(10);
		t2.setBounds(108, 141, 264, 27);
		f.getContentPane().add(t2);
		
		JButton age = new JButton("나의 내년 나이는?");
		age.setBounds(22, 187, 350, 40);
		f.getContentPane().add(age);
		
		age.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s1 = t2.getText();
				int s12 = Integer.parseInt(s1);
				int result = s12 + 1;
						JOptionPane.showMessageDialog(f, result);
			}
		});
		
		JLabel lblNewLabel_1_1 = new JLabel("국어 점수");
		lblNewLabel_1_1.setBounds(12, 237, 84, 34);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("수학 점수");
		lblNewLabel_1_2.setBounds(12, 290, 84, 34);
		f.getContentPane().add(lblNewLabel_1_2);
		
		t3 = new JTextField();
		t3.setBackground(new Color(0, 255, 255));
		t3.setColumns(10);
		t3.setBounds(108, 237, 264, 27);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setBackground(new Color(0, 255, 255));
		t4.setColumns(10);
		t4.setBounds(108, 297, 264, 27);
		f.getContentPane().add(t4);
		
		JButton avg = new JButton("두 과목의 점수 평균은?");
		avg.setBounds(22, 344, 350, 40);
		f.getContentPane().add(avg);
		f.setVisible(true);
		
		avg.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s1 = t3.getText();
				String s2 = t4.getText();
				
				double s12 = Double.parseDouble(s1);
				double s22 = Double.parseDouble(s2);
				
				double result = (s12 + s22) / 2;
				
				JOptionPane.showMessageDialog(f, result);
			}
		});
	}
}
