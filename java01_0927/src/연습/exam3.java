package 연습;

import javax.swing.JOptionPane;

public class exam3 {
	public static void main(String[] args) {
	    String telecom = JOptionPane.showInputDialog("통신사를 입력하세요");
		String number = JOptionPane.showInputDialog("전화번호를 입력하세요(000-0000-0000)");
		String name = JOptionPane.showInputDialog("가입자 이름을 입력하세요");
		
		String result = name + "님은 " + telecom + "에 " + number;
	      
	    JOptionPane.showMessageDialog(null, "다이얼로그로 " + result + "로 가입되셨습니다.");
		
	}
}
