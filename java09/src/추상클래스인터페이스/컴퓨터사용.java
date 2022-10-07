package 추상클래스인터페이스;

public class 컴퓨터사용 {

	public static void main(String[] args) {
		애플컴 appleCom = new 애플컴();
		바나나컴 bananaCom = new 바나나컴();
		
		appleCom.입력();
		appleCom.출력();
		appleCom.기억();
		
		bananaCom.입력();
		bananaCom.출력();
		bananaCom.기억();
	}

}
