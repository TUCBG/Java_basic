package 형변환;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 신호등 {
	public static void main(String[] args) {
		String[] color = {"red.png", "yellow.png", "blue.png"};
		
		JFrame f = new JFrame();
		f.setSize(700, 700);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton redBtn = new JButton("\uBE68\uAC15");
		redBtn.setBackground(new Color(255, 0, 0));
		redBtn.setBounds(12, 10, 190, 23);
		f.getContentPane().add(redBtn);
		redBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon(color[0]);
				img.setIcon(icon);
				f.add(img);
				f.setVisible(true);
			}
		});
		
		JButton yellowBtn = new JButton("\uB178\uB791");
		yellowBtn.setBackground(new Color(255, 255, 0));
		yellowBtn.setBounds(247, 10, 190, 23);
		f.getContentPane().add(yellowBtn);
		yellowBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon(color[1]);
				img.setIcon(icon);
				f.add(img);
				f.setVisible(true);
			}
		});
		
		JButton blueBtn = new JButton("\uD30C\uB791");
		blueBtn.setBackground(new Color(0, 0, 255));
		blueBtn.setBounds(482, 10, 190, 23);
		f.getContentPane().add(blueBtn);
		
		blueBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon(color[2]);
				img.setIcon(icon);
				f.add(img);
				f.setVisible(true);
			}
		});
		
		f.setVisible(true);
		
	}
}
