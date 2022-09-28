package 조건문;

import java.util.Date;

public class SwitchCase테스트2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int month = date.getMonth() + 1;
		int day = date.getDay();
		
		switch (day) {
		case 0: case 6:
			System.out.println("Play!!");
			break;

		default:
			System.out.println("Study:(");
			break;
		}
		
		switch (month) {
		case 0: case 1: case 2:
			System.out.println("Winter");
			break;

		case 3: case 4: case 5:
			System.out.println("Spring");
		
		case 6: case 7: case 8:
			System.out.println("Summer");
	
		default:
			System.out.println("Fall");
			break;
		}
	}

}
