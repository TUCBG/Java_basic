package 추상클래스인터페이스;

public class 바나나컴 implements 컴퓨터{

	@Override
	public void 입력() {
		System.out.println("이쁜 마우스");
	}

	@Override
	public void 출력() {
		System.out.println("멋진 키보드");
	}

	@Override
	public void 기억() {
		System.out.println("굉장한 메모리");
	}

}
