package 조건문;

public class Ifelse테스트2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 84;
		String result = "";
		
		if (score >= 90) {
			result = "A";
		} else if (score >= 85 && score < 90) {
			result = "B+";
		} else if (score < 85 && score > 80) {
			result = "B";
		} else if(score >= 70) {
			result = "C";
		} else {
			result = "F";
		}
		
		System.out.println("당신의 학점은 >> " + result);
	}

}
