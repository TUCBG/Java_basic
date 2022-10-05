package 생성자;

import 생성자.컴퓨터;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		컴퓨터 com1 = new 컴퓨터(300000, "삼성", 50);
		컴퓨터 com2 = new 컴퓨터(350000, "한성", 60);
		
		System.out.println(com1);
		System.out.println(com2);
	}

}
