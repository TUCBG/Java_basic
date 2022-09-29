package 배열응용;

public class 배열여러개 {

	public static void main(String[] args) {
		String[] family = {"아버지", "어머니", "나"};
		int[] age = {100, 50, 20};
		double[] height = {177.7, 132.2, 155.3};
		System.out.println(family[2] + " " + age[2] + " " + height[2]);
		
		for (int i = 0; i < family.length; i++) {
			System.out.print(family[i] + " ");
		}
	}
}
