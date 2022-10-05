package 클래스만들기;

public class 전화기 {
	// 멤버변수 > 자동초기화됨 , 값을 넣을지 선언만 함
	public int size;
	public String speaker;
	// 멤버변수, 배열 > 자동초기화 시켜줌
	
	
	//동작(기능)을 정의
	//멤버메서드(함수)
	public void 통화하다() {
		System.out.println("통화를 하다.");
	}
	
	public void 사진을찍다() {
		System.out.println("셀카를 찍다.");
	}
}
