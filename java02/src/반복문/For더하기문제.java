package 반복문;

public class For더하기문제 {

	public static void main(String[] args) {
		//33 ~ 222 모두 더하기
		int sum1 = 0;
		for (int i = 33; i <= 222; i++) {
			sum1 = sum1 + i;
		}
		System.out.println(sum1);
		//55 ~ 4500까지 2씩 점프하면서 더하기
		int sum2 = 0;
		for (int i = 55; i <= 4500; i = i + 2) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
		//0 ~ 6000까지 5씩 점프하면서 더하기
		int sum3 = 0;
		for (int i = 0; i <= 6000; i = i + 5) {
			sum3 = sum3 + i;
		}
		System.out.println(sum3);
		
		//문제2
		//1. 1부터 1000까지 3씩 점프해서 더하기
		//2. 만약 더한 값이 100이 넘으면 더하기를 종료
		//3. 5의 배수는 더하지 않음
		int sum4 = 0;
		
		for (int i = 1; i <= 1000; i = i + 3) {
			if (sum4 > 100) {
				break;
			} else {
				if (i % 5 != 0) {
					sum4 = sum4 + i;
				}
			}
		}
		System.out.println(sum4);
	}
	
}
