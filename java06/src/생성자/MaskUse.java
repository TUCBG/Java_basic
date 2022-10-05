package 생성자;

import 생성자.Mask;

public class MaskUse {

	public static void main(String[] args) {
//		Mask m = new Mask();
//		
//		m.color = "흰색";
//		m.count = 1;
//		m.price = 1000;
		
//		public Mask() {
//			
//		}
		
		Mask m1 = new Mask("검정색", 2500, 2);
		System.out.println(m1.color);
		System.out.println(m1.price);
		System.out.println(m1.count);
		
	}

}
