package 반복문;

import java.util.Scanner;

public class 투표 {

	public static void main(String[] args) {
		int iu = 0;
		int you = 0;
		int bts = 0;
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("입력 : 1. 아이유 2. 유재석 3. 방탄소년단 >> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				iu++;
				
			} else if (choice == 2) {
				you++;
			} else if (choice == 3) {
				bts++;
			} else {
				System.out.println("없는 번호입니다.");
			}
			
			System.out.print("투표를 종료하시겠습니까? (y / n) : ");
			String exit = sc.next();
			
			char exit2 = exit.charAt(0); 
			if (exit2 == 'y') {
				System.out.println("투표 결과 : 1. 아이유 " + iu + "표 2. 유재석 " + you + "표 3. 방탄소년단 " + bts + "표");
				System.out.println("투표를 종료합니다.");
				System.exit(0);
			}
		}
	}

}
