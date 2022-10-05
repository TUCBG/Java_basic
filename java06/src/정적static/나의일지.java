package 정적static;

public class 나의일지 {
	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 10, "강남역");
		System.out.println(day1);
		System.out.println(Day.count);
		System.out.println(Day.allTime);
		System.out.println(Day.avgTime());
		
		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(day2);
		System.out.println(Day.count);
		System.out.println(Day.allTime);
		System.out.println(Day.avgTime());
		
		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(day3);
		System.out.println(Day.count);
		System.out.println(Day.allTime);
		System.out.println(Day.avgTime());
		
	}
}
