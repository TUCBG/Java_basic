package �÷���;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class �������ǵ����� {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("ȫ�浿");
		list.add("ȫ�浿");
		list.add("ȫ�浿");
		list.add(100);
		list.add(11.1);
		
		System.out.println(list);
		System.out.println(list.size());
		
		HashSet set = new HashSet();
		//set.add(list.get(0));
		//set.add(list.get(1));
		//set.add(list.get(2));
		
		//System.out.println(set);
		
		for (int i = 0; i < list.size(); i++) {
			set.add(list.get(i));
		}
		System.out.println(set);
	}

}
