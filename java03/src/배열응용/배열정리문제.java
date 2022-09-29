package 배열응용;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		//1번
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("숫자입력 : ");	
			num[i] = sc.nextInt();
		}
		System.out.println("첫 번째와 세 번째 합 : " + (num[0] + num[2]));
		
		
		//2번
		String[] s = new String[3];
		for (int i = 0; i < s.length; i++) {
			System.out.print("문자 입력 : ");	
			s[i] = sc.next();
		}
		System.out.print(s[0] + "보다는  " + s[1]);
	}
	
}
