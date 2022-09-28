package 순차문;

import java.util.Scanner;

public class 나의정보2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 >> ");
		String name = sc.next();
		
		System.out.print("나의 키 >> ");
		double  height = sc.nextDouble();
		double height2 = height + 10;
		
		System.out.print("몸무게 >> ");
		double weight = sc.nextDouble();
		double weight2 = weight - 10;
		System.out.println("저녁을 먹었나요?(true / false) >> ");
		String food = sc.next();
		sc.nextLine();
		
		System.out.println("나의 좌우명은? >> ");
		String motto = sc.nextLine();
		
		System.out.println("---------------------");
		System.out.println("나의 이름은 " + name);
		System.out.println("나의 내년 키 " + height2);
		System.out.println("나의 내년 몸무게 " + weight2);
		
		if(food.equals("true")) {
			System.out.println("배가 부르시겠네요");
		} else {
			System.out.println("배고프시겠네요");
		}
		System.out.println("나의 좌우명은 " + motto);
		
	}
}
