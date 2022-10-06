package 형변환;

import java.util.ArrayList;

public class 형변환확인 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1000);
		list.add(189.1);
		list.add(false);
		list.add('남');
		
		//1
		//System.out.println(list.size());
		System.out.println(list);
		
		//2
		int money = (int)list.get(0) + 2000;
		System.out.println(money);
		//3
		double height = (double)list.get(1) + 10;
		System.out.println(height);
		//4
		boolean food = (boolean)list.get(2);
		if (food) {
			System.out.println("배불러요");
		}else {
			System.out.println("배고파요");
		}
		
		//5
		char gender = (char)list.get(3);
		if (gender == '남') {
			System.out.println("주민번호 1, 3");
		} else {
			System.out.println("주민번호 2, 4");
		}
	}

}
