package ����static;

public class ���� {
	String name;
	int age;
	String gender;

	static int count;
	static int ageTotal;
	
	public ����(String name, int age, String gender) {
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
		return "���� [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}
