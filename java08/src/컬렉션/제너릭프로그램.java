package 컬렉션;

import java.util.ArrayList;

public class 제너릭프로그램 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("String1");
		list.add("String2");
		list.add("String3");
		list.add("String4");
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(400);
		list2.add(500);
		list2.add(600);
		System.out.println(list2);
	}
}
