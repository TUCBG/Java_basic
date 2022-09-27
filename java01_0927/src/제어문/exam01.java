package 제어문;

import javax.swing.JOptionPane;

public class exam01 {
	public static void main(String[] args) {
		String pw = "p";
		
		String pw2 = JOptionPane.showInputDialog("암호 입력 : ");
		
		if (pw.equals(pw2)) {
			JOptionPane.showMessageDialog(null, "PASS!");
		} else {
			JOptionPane.showMessageDialog(null, "재입력!");
		}
	}
}
