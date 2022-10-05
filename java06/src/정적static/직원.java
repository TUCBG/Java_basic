package 沥利static;

public class 流盔 {
	String name;
	int age;
	String gender;

	static int count;
	static int ageTotal;
	
	public 流盔(String name, int age, String gender) {
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
		return "流盔 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}
