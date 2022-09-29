package 배열응용;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범 {
	
	//전체영역에서 특정한 변수를 사용하려면 
	//클래스 아래에 선언해야한다.
	static int start = 2; //전역변수
	
	public static void main(String[] args) {
		//ppt 104
		// 영화제목
		String[] title = { "명량", "한산", "태극기휘날리며", "고지전", "남한산성" };
		
		// 포스터파일(파일이름)
		String[] img = { "명량.png", "한산.png", "태극기휘날리며.png", "고지전.png", "남한산성.png" };

		// 평점
		double[] jumsu = { 99.9, 88.8, 77.7, 66.6, 55.5 };
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(113, 253, 221));
		f.setSize(685, 734);
		
		JLabel top = new JLabel("태극기휘날리며");
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("서울남산체 L", Font.BOLD, 45));
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JLabel center = new JLabel("");
		center.setBackground(new Color(113, 253, 221));
		center.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		
		f.getContentPane().add(center, BorderLayout.CENTER);
		
		JLabel under = new JLabel("77.7점");
		under.setBackground(new Color(113, 253, 221));
		under.setHorizontalAlignment(SwingConstants.CENTER);
		under.setFont(new Font("서울남산체 L", Font.BOLD, 35));
		f.getContentPane().add(under, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//<<버튼을 클릭했을 때 처리하고 싶은 내용이 있으면, 
				//actionPerformed()함수안에 넣어주세요.
				//제목이 표시된 라벨에 제목을 변경해야함.
				start = start - 1; // 1 = 2 -1
				top.setText(title[start]); //title[1]
				under.setText(jumsu[start]+"점");
				ImageIcon icon = new ImageIcon(img[start]);
				center.setIcon(icon);
			}
		});
		
		btnNewButton.setBackground(new Color(202, 255, 223));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start++;
				top.setText(title[start]);
				under.setText(jumsu[start]+"점");
				ImageIcon icon = new ImageIcon(img[start]);
				center.setIcon(icon);
			}
		});
		btnNewButton_1.setBackground(new Color(202, 255, 223));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		f.setVisible(true);
		
		
	}
}