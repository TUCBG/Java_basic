package 배열응용;

import java.util.Random;
import java.util.Scanner;

public class 가고싶었던곳 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String[] lastyear = new String[3];
		String[] thisyear = new String[3];
		
		for (int i = 0; i < lastyear.length; i++) {
			System.out.print("작년에 가고 싶었던 곳 : ");
			lastyear[i] = sc.next();	
		}
		
		for (String x : lastyear) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < thisyear.length; i++) {
			System.out.print("올해에 가고 싶었던 곳 : ");
			thisyear[i] = sc.next();	
		}
		
		for (String y : thisyear) {
			System.out.print(y + " ");
		}
		
		System.out.println();
		
		int count = 0;
		for (int i = 0; i < thisyear.length; i++) {
			if (thisyear[i].equals(lastyear[i])) {
				count++;
			}
		}
		System.out.println(count);
	}

}
