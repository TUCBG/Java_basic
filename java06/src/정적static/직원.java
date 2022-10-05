package 정적static;

public class 직원 {
	String name;
	int age;
	String gender;

	static int count;
	static int ageTotal;
	
	public 직원(String name, int age, String gender) {
		count++;
		this.name = name;
		this.age = age;
		this.gender = gender;
		
		ageTotal += age;
	}
	
	public static int avgAge() {
		return ageTotal / count;
	}


	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}
