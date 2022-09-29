package 배열응용;

import java.util.Random;

public class 토익채점2 {

	public static void main(String[] args) {
		int[] an = new int[990];
		int[] myan = new int[990];
		
		Random r = new Random();
		
		for (int i = 0; i < myan.length; i++) {
			an[i] = r.nextInt(4) + 1;
			myan[i] = r.nextInt(4) + 1;
		}
		
		int score = 0;
		
		for (int i = 0; i < myan.length; i++) {
			if(an[i]== myan[i]) {
				score++;
			}
		}
		System.out.println("점수 : " + score);
	}

}
