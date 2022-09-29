package practice;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1300, 1000);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		int[] seat = new int[500];
		
		for (int i = 0; i < 500; i++) {
			JButton b = new JButton(i + "");
			f.add(b);
			
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand();
					JOptionPane.showMessageDialog(f, s + "번 예약완료");
					b.setEnabled(false); 
					b.setBackground(Color.red);
					int index = Integer.parseInt(s);
					seat[index] = 1;
					
					int count = 0;
					
					for (int j : seat) {
						if(j == 1) {
							count++;
						}
					}
					JOptionPane.showMessageDialog(f, "예약된 좌석은 " + count + "개");
					int sum = count *13000;
					JOptionPane.showMessageDialog(f, "총 결제금액은 " + sum + "입니다.");
				}
			});
		}
		
		f.setVisible(true);
	}

}
