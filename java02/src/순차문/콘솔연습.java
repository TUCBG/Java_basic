package 순차문;

import java.util.Scanner;

public class 콘솔연습 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("이름을 입력 : ");
		 String name = sc.next();
		 System.out.println("입력받은 이름은 " + name + "입니다.");

		 System.out.print("소속을 입력 : ");
		 String com = sc.next();
		 System.out.println("입력받은 소속은 " + com + "입니다.");
	}

}
