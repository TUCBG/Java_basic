package �÷���;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class ���� {

	public static void main(String[] args) {
		//1
		HashSet team = new HashSet();
		
		team.add("�����̳�");
		team.add("���α׷���");
		team.add("DB������");
		team.add("DB������");
		
		System.out.println(team);
		// System.out.println(team.size());
		
		//2
		LinkedList milk = new LinkedList();
		milk.add("���� ����");
		milk.add("�̽� ����");
		milk.remove();
		System.out.println(milk);
		
		//3
		ArrayList ski = new ArrayList();
		ski.add("�ڽ�Ű");
		ski.add("�۽�Ű");
		ski.add("�轺Ű");
		ski.add("����Ű");
		
		System.out.println(ski);
	}

}
