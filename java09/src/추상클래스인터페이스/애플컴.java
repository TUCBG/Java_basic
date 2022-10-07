package 추상클래스인터페이스;

public class 애플컴 implements 컴퓨터{

	@Override
	public void 입력() {
		System.out.println("키보드");
	}

	@Override
	public void 출력() {
		System.out.println("모니터");
	}

	@Override
	public void 기억() {
		System.out.println("메모리");
	}

}
