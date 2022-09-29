package 배열기본;

import java.util.Iterator;

public class 배열테스트2 {

	public static void main(String[] args) {
		//1번
		int[] space = new int[5];
		
		//2번
		System.out.print("2번 : ");
		System.out.println(space.length);
		
		//3번
		System.out.print("3번 : ");
		space[0] = 100;
		System.out.println(space[0]);
		
		//4번
		System.out.print("4번 : ");
		space[4] = 500;
		
		System.out.println(space[4]);
		//5번
		System.out.print("5번 : ");
		space[2] = 200;
		System.out.println(space[2]);
		
		//6번
		System.out.print("6번 : ");
		for (int i = 0; i < space.length; i++) {
			System.out.print(space[i] + " ");
		}
		
		//7번
		System.out.println("");
		System.out.print("7번 : ");
		for (int i = 0; i < space.length; i++) {
			System.err.println(i + " : " + space[i]);
		}
	}

}
