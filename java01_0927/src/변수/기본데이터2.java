package 변수;

public class 기본데이터2 {

	public static void main(String[] args) {
		// 정수
		byte age = 100; // 127이하(1바이트)
		short wallet = 20000; // 3만(2바이트)
		int money = 500000000; // 21억 (4바이트)
		long space = 10000000000L; // 21억 이상(8바이트), 그냥 쓰면 int로 인식. 뒤에 L(l)을 붙여 줘야됨
		
		//실수
		double height = 185.5; // 8바이트
		float weight = 88.8F; // 그냥 쓰면 double로 인식. 뒤에 F(f)를 붙여 줘야됨
		
		//문자 (2바이트)
		char gender =  '남';
		
		//논리 
		boolean todayFinished = false;
		
		//문자열
		String name = "홍길동";
	}

}
