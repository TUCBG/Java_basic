package 상속;

public class 사람 {
	String gender;
	String name;
	
	public void 잠자다() {
		System.out.println("Zzzzz....");
	}
	
	public void 먹다() {
		System.out.println("Nyam Nyam");
	}

	
	@Override
	public String toString() {
		return "사람 [gender=" + gender + ", name=" + name + "]";
	}
	
}
