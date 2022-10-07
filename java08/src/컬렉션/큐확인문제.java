package 컬렉션;

import java.util.LinkedList;

public class 큐확인문제 {

	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		link.add("국어");
		link.add("수학");
		link.add("영어");
		link.add("컴퓨터");
		
		//1일차
		link.remove();
		System.out.println(link);
		//2일차
		link.remove();
		System.out.println(link);
		//3일차
		link.remove();
		System.out.println(link);
	}
}
