package 제어문;

import javax.swing.JOptionPane;

public class exam02 {

	public static void main(String[] args) {
		
		String weight = JOptionPane.showInputDialog("몸무게 변화 : ");
		double weight2 = Double.parseDouble(weight);
		
		if (weight2 > 2) {
			JOptionPane.showMessageDialog(null, "다이어트 성공");
		} else {
			JOptionPane.showMessageDialog(null, "다이어트 실패");
		}
	}

}
