package 연습;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Toolkit;

public class 계산기 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame  f = new JFrame();
		f.setSize(310,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\CBG\\Desktop\\백엔드과정\\ECLIPSE\\java01\\src\\calc.png"));
		lblNewLabel.setBounds(12, 10, 270, 288);
		f.getContentPane().add(lblNewLabel);
		
		JButton plus = new JButton("+");
		plus.setBounds(12, 418, 52, 23);
		f.getContentPane().add(plus);
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String n1 = t1.getText();
				String n2 = t2.getText();
				
				int n12 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				JOptionPane.showMessageDialog(f, n12 + n22);
				t1.setText("");
				t2.setText("");
			}
		});
		
		JButton minus = new JButton("-");
		minus.setBounds(76, 418, 52, 23);
		f.getContentPane().add(minus);
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String n1 = t1.getText();
				String n2 = t2.getText();
				
				int n12 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				JOptionPane.showMessageDialog(f,(n12 - n22));
				t1.setText("");
				t2.setText("");
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("숫자 1");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(22, 308, 82, 32);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(103, 308, 150, 32);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("숫자 2");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(22, 356, 82, 32);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(103, 356, 150, 32);
		f.getContentPane().add(t2);
		
		JButton div = new JButton("÷");
		div.setBounds(230, 418, 52, 23);
		f.getContentPane().add(div);
		div.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String n1 = t1.getText();
				String n2 = t2.getText();
				
				int n12 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				JOptionPane.showMessageDialog(f,(n12 / n22));
				t1.setText("");
				t2.setText("");
			}
		});
		
		
		JButton mul = new JButton("×");
		mul.setBounds(166, 418, 52, 23);
		f.getContentPane().add(mul);
		f.setVisible(true);
		mul.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String n1 = t1.getText();
				String n2 = t2.getText();
				
				int n12 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				JOptionPane.showMessageDialog(f,(n12 * n22));
				t1.setText("");
				t2.setText("");
			}
		});
	}
}
