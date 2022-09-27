package 연습;

import javax.swing.JOptionPane;

public class exam2 {

	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("키를 입력 : ");
		Double height2 = Double.parseDouble(height);
		
		JOptionPane.showMessageDialog(null,"적정 몸무게는 " + (height2 - 100)*0.9 );

	}

}
