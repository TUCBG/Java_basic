package 클래스만들기;

import 클래스만들기.전화기;
import 클래스만들기.강아지;

public class 내방프로젝트 {
	public static void main(String[] args) {
		
		전화기 p1 = new 전화기();
		System.out.println(p1);
		p1.size = 11;
		p1.speaker = "바나나사";
		
		System.out.println(p1.size);
		System.out.println(p1.speaker);
		p1.통화하다();
		p1.사진을찍다();
		
		
		전화기 p2 = new 전화기();
		p2.size = 55;
		p2.speaker = "전화기는 비싸";
		System.out.println(p2.size);
		System.out.println(p2.speaker);
		
		p2.통화하다();
		p2.사진을찍다();
		
		강아지 d = new 강아지();
		System.out.println(d);
		
		d.weight = 3.14;
		d.color = "흰색";
		
		System.out.println(d.weight);
		System.out.println(d.color);
		
		d.먹다();
		d.놀다();
	}
}
