package 배열응용;

import java.util.Scanner;

public class 숫자입력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자 입력 : ");
			num[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i  = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println();
		System.out.println(sum);
	}
}
