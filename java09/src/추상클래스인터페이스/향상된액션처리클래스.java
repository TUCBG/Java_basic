package 추상클래스인터페이스;

public class 향상된액션처리클래스 implements Myaction{

	@Override
	public void click() {
		System.out.println("보안이 강화된 상태로 인터넷 연결");
	}

	@Override
	public void doubleClick() {
		System.out.println("화면에 경고메세지를 띄운 후 화면을 닫음");
	}

}
