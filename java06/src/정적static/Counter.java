package 정적static;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Counter {
	static int count;
	
	public static void main(String[] args) {
		JFrame f = new JFrame("카운터 프로그램");
		f.setSize(300, 300);
		f.getContentPane().setLayout(null);
		
		JLabel numberLabel = new JLabel("0");
		numberLabel.setHorizontalAlignment(SwingConstants.CENTER);
		numberLabel.setForeground(new Color(255, 0, 0));
		numberLabel.setFont(new Font("굴림", Font.BOLD, 99));
		numberLabel.setBounds(12, 105, 260, 132);
		f.getContentPane().add(numberLabel);
		
		JButton btnPlus = new JButton("+1");
		btnPlus.setBackground(new Color(128, 255, 0));
		btnPlus.setBounds(12, 10, 66, 23);
		f.getContentPane().add(btnPlus);
		btnPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count++; 
				numberLabel.setText("" + count);
			}
		});
		
		JButton btnReset = new JButton("\uCD08\uAE30\uD654");
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setBackground(new Color(0, 0, 255));
		btnReset.setBounds(90, 10, 104, 23);
		f.getContentPane().add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0; 
				numberLabel.setText("" + count);
			}
		});
		
		JButton btnMinus = new JButton("-1");
		btnMinus.setBackground(new Color(128, 255, 0));
		btnMinus.setBounds(206, 10, 66, 23);
		f.getContentPane().add(btnMinus);
		f.setVisible(true);
		btnMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count--; 
				numberLabel.setText("" + count);
			}
		});
	}
}
