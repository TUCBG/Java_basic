package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 정답맞추기 {

	public static void main(String[] args) {
		Random random = new Random();
		int target = random.nextInt(100);
		int count = 0;
		
		while(true) {
			String data = JOptionPane.showInputDialog("0 ~ 99까지 생각한 숫자 입력 : ");
			int data2 = Integer.parseInt(data);
			count ++;
			
			if (target > data2 && data2 < 100) {
				JOptionPane.showMessageDialog(null,"UP");
			} else if (target < data2 && data2 < 100) {
				JOptionPane.showMessageDialog(null,"DOWN");
			} else if(target == data2){
				JOptionPane.showMessageDialog(null,"정답입니다.");
				break;
				//System.exit(0);
			}else {
				JOptionPane.showMessageDialog(null,"잘못된 값입니다.");
			}
			
		}
		JOptionPane.showMessageDialog(null, count +"번만에 맞추셨어요!");
		JOptionPane.showMessageDialog(null, (count - 1)+ "번 틀리셨어요!");
		JOptionPane.showMessageDialog(null,"다음에 또 방문해주세요");
	}
}
