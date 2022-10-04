package 클래스만들기;

import 클래스만들기.계좌정보;

public class 계좌정보프린트 {

	public static void main(String[] args) {
		계좌정보 계좌1 = new  계좌정보();
		계좌정보 계좌2 = new  계좌정보();
		계좌정보 계좌3 = new  계좌정보();
		계좌1.name = "홍길동";
		계좌2.name = "박길동";
		계좌3.name = "홍기사";
		
		계좌1.accountName = "튼튼적금";
		계좌2.accountName = "튼튼예금";
		계좌3.accountName = "다음적금";
		
		계좌1.money = 1000;
		계좌2.money = 2000;
		계좌3.money = 3000;
		
//		System.out.println(계좌1);
//		System.out.println(계좌2);
//		System.out.println(계좌3);
		
		계좌1.계좌정보();
		계좌2.계좌정보();
		계좌3.계좌정보();
	}

}
