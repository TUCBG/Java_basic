package 조건문;

public class SwitchCase테스트 {

	public static void main(String[] args) {
		String name = "Java";
		
		switch (name) {
		case "Java":
			System.out.println("1103");
			break;
		case "Python":
			System.out.println("1104");
			break;
		case "Linux":
			System.out.println("1105");
			break;
		case "Go":
			System.out.println("1106");
			break;
		case "JavaScript":
			System.out.println("1107");
			break;

		default:
			System.out.println("Counter");
			break;
		}
	}

}
