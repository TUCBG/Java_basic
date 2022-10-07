package 컬렉션;

import java.util.HashMap;

public class 전화번호맵 {

	public static void main(String[] args) {
		HashMap phone = new HashMap();
		phone.put(1, "Mom");
		phone.put(2, "Dad");
		phone.put(3, "Bro");
		phone.put(4, "Friend");
		
		System.out.println(phone);
		System.out.println(phone.get(1));
		
		phone.put(4, "Colleague");
		System.out.println(phone);
		
		phone.remove(1);
		System.out.println(phone);
	}

}
