package 제어문;

import javax.swing.JOptionPane;

public class exam05 {

	public static void main(String[] args) {
		double pi = 3.14;
		String half = JOptionPane.showInputDialog("반지름 입력 : ");
		
		double half2 = Double.parseDouble(half);
		
		double result = pi * (half2 * half2);
		JOptionPane.showMessageDialog(null, result);
	}

}
