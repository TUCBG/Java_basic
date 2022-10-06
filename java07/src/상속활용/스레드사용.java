package 상속활용;

public class 스레드사용 {
	public static void main(String[] args) {
		시각스레드 t1 = new 시각스레드();
		이미지스레드 t2 = new 이미지스레드();
		카운터스레드 t3 = new 카운터스레드();
		
		t1.start();
		t2.start();
		t3.start();		
		
	}
}
