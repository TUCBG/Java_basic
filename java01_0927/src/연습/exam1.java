package 연습;

import javax.swing.JOptionPane;

public class exam1 {

	public static void main(String[] args) {
		String ver = JOptionPane.showInputDialog("가로입력 : ");
		String hor = JOptionPane.showInputDialog("세로입력 : ");
		
		int ver2 = Integer.parseInt(ver);
		int hor2 = Integer.parseInt(hor);
		int a = 100;
		JOptionPane.showMessageDialog(null, "사각형의 면적은 " + (ver2 * hor2));

	}

}
