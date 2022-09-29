package 배열응용;

import java.util.Random;

public class 랜덤한값배열넣기 {

	public static void main(String[] args) {
		int[] num = new int[6];
		Random r = new Random();
		
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(45) + 1;
		}
		
		for (int x : num) {
			System.out.println(x + " " );
		}
	}

}
