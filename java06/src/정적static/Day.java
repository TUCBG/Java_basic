package ����static;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static double allTime;
	//static double avgTime;
	
	//��ü ������, 3�� ������ �ݵ�� �־ ��ü ����!
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
	//��ü ���� ��, ������ ��ü�� �ּҰ� �ƴ϶�, �� �ּҰ� ����Ű�� �ν��Ͻ� ������ ������ ������ String�� ����� �ּ���! 
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
}
