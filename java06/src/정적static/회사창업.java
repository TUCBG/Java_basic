package 정적static;

import 정적static.직원;

public class 회사창업 {
	public static void main(String[] args) {
		직원 work1 = new 직원("홍길동", 25, "여");
		
		
		직원 work2 = new 직원("김길동", 24, "남");
		
		
		직원 work3 = new 직원("송길동", 26, "여");	
		
		//1) 회사 직원의 수
		System.out.println("직원의 수 : " + 직원.count);
		
		//2) 회사 직원 각각의 정보 프린트
		System.out.println(work1);
		System.out.println(work2);
		System.out.println(work3);
		
		//3) 회사 직원 평균 나이
		System.out.println("평균 나이 : " + 직원.avgAge());
	}

}
