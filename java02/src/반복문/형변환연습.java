package 반복문;

public class 형변환연습 {

	public static void main(String[] args) {
		int a = 100; // 4개(대)
		byte b = 50;// 1개(소)
		a = b; // int <--- byte 
		// 타입변환(형변환)
		// 큰공간 <--- 작은 공간 데이터(자동 형변환)
		
		int c = 100; // 4대(대)
		b = (byte)c;
		// 작은 공간 <--- 큰 공간 데이터(강제 형변환)
		// (작은 공간 이름)변수;
		//조심할 것은 작은 공간에 들어갈 수 있는 범위여야 한다.
		//byte -128 ~ 127
		
		System.out.println(b);
	}

}
