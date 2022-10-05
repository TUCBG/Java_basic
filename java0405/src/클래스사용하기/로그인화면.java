package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import 클래스사용하기.일기쓰기화면;

public class 로그인화면 {
	private static JTextField t1;
	private static JTextField t2;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(148, 254, 209));
		f.setSize(400,400);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\CBG\\Desktop\\백엔드과정\\ECLIPSE\\java04\\일기장.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(85, 10, 223, 96);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setBounds(46, 119, 57, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("비밀번호");
		lblNewLabel_2.setBounds(46, 179, 57, 15);
		f.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setForeground(new Color(0, 0, 0));
		t1.setBounds(115, 116, 193, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setForeground(new Color(0, 0, 0));
		t2.setBounds(115, 176, 193, 21);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\CBG\\Desktop\\백엔드과정\\ECLIPSE\\java04\\로그인.png"));
		btnNewButton.setBounds(85, 270, 62, 66);
		f.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				
				if (id.equals("root")) {
					if (pw.equals("1234")) {
						일기쓰기화면 diary = new 일기쓰기화면();
						diary.open();
					}else {
						JOptionPane.showMessageDialog(f, "비밀번호를 확인해주세요.");
					}
				} else {
					JOptionPane.showMessageDialog(f, "아이디 혹은 비밀번호를 확인해주세요.");
				}
				
			}
		});
		
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\CBG\\Desktop\\백엔드과정\\ECLIPSE\\java04\\리셋.png"));
		btnNewButton_1.setBounds(246, 270, 62, 66);
		f.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
			}
		});
		
		f.setVisible(true);		
	}
}
