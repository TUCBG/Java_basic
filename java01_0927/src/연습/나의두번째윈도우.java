package 연습;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class 나의두번째윈도우 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400,400);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setBounds(22, 58, 24, 34);
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(92, 65, 179, 21);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("전화번호");
		lblNewLabel_1.setBounds(22, 120, 73, 34);
		f.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(92, 127, 179, 21);
		f.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("주소");
		lblNewLabel_2.setBounds(22, 181, 24, 34);
		f.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(92, 188, 179, 21);
		f.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.setBounds(34, 267, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setBounds(191, 267, 97, 23);
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);
	}
}
