package 제어문;

import javax.swing.JOptionPane;

public class exam03 {

	public static void main(String[] args) {
		String pw = "p";
		String pw2 = JOptionPane.showInputDialog("암호 입력 : ");
		
		String weight = JOptionPane.showInputDialog("몸무게 변화 : ");
		double weight2 = Double.parseDouble(weight);
		
		if (pw.equals(pw2) && (weight2 > 2)) {
			JOptionPane.showMessageDialog(null, "오늘은 성공!");
		} else {
			JOptionPane.showMessageDialog(null, "내일 다시 도전!");
		}
		
	}

}
