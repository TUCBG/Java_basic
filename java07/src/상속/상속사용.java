package 상속;

public class 상속사용 {
	public static void main(String[] args) {
		사람 p = new 사람();
		
		p.gender = "남자";
		p.name = "클라크";
		
		System.out.println(p);
		
		맨 m = new 맨();
		m.gender = "남자";
		m.name = "데이비드";
		m.size = 99;
		System.out.println(m);
		
		수퍼맨 sMan = new 수퍼맨();
		sMan.gender = "남자";
		sMan.name = "클라크켄트";
		sMan.size = 191;
		System.out.println(sMan);
	
	}
}