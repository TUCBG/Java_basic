package 정적static;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static double allTime;
	//static double avgTime;
	
	//객체 생성시, 3개 데이터 반드시 넣어서 객체 생성!
	public Day(String doing, int time, String location) {
		count++;
		
		this.doing = doing;
		this.time = time;
		this.location = location;
		
		allTime += time;
		
		//avgTime = allTime / count;
	}
	
	public static double avgTime() {
		return allTime / (double)count;
	}
	//객체 생성 후, 생성된 객체의 주소가 아니라, 그 주소가 가르키는 인스턴스 변수의 값들을 가지고 String을 만들어 주세요! 
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
}
