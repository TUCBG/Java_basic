package 제어문;

import javax.swing.JOptionPane;

public class exam04 {

	public static void main(String[] args) {
		String py = JOptionPane.showInputDialog("체육 : ");
		String ma = JOptionPane.showInputDialog("수학 : ");
		String en = JOptionPane.showInputDialog("영어 : ");
		String la = JOptionPane.showInputDialog("국어 : ");
		
		double py2 = Double.parseDouble(py);
		double ma2 = Double.parseDouble(ma);
		double en2 = Double.parseDouble(en);
		double la2 = Double.parseDouble(la);
		
		double result = (py2 + ma2 + en2 + la2) / 4;
		
		JOptionPane.showMessageDialog(null, "평균은 " + result);
	}

}
