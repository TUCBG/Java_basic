package 추상클래스인터페이스;

public class 액션처리클래스사용하기 {
	public static void main(String[] args) {
		액션처리클래스 a1 = new 액션처리클래스();
		향상된액션처리클래스 a2 = new 향상된액션처리클래스();
		
		a1.click();
		a1.doubleClick();
		a2.click();
		a2.doubleClick();
	}
}
