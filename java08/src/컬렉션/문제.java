package 컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class 문제 {

	public static void main(String[] args) {
		//1
		HashSet team = new HashSet();
		
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리자");
		team.add("DB관리자");
		
		System.out.println(team);
		// System.out.println(team.size());
		
		//2
		LinkedList milk = new LinkedList();
		milk.add("상한 우유");
		milk.add("싱싱 우유");
		milk.remove();
		System.out.println(milk);
		
		//3
		ArrayList ski = new ArrayList();
		ski.add("박스키");
		ski.add("송스키");
		ski.add("김스키");
		ski.add("개스키");
		
		System.out.println(ski);
	}

}
