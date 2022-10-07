package ÄÃ·º¼Ç;

import java.util.HashMap;

public class °í°´°ü¸® {

	public static void main(String[] args) {
		HashMap manage = new HashMap();
		manage.put(100, "±èµ¥ÀÌ");
		manage.put(200, "±è»çÀü");
		manage.put(300, "±è±¸Á¶");
		manage.put(400, "±èÀÚ·á");
		
		System.out.println(manage);
		
		manage.remove(200);
		System.out.println("200¹ø Å»Åğ : " + manage);
		
		manage.put(300, "±èÃæ¼º");
		System.out.println("300¹ø °³¸í : " + manage);
		
	}
}
