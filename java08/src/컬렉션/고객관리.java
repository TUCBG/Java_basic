package �÷���;

import java.util.HashMap;

public class ������ {

	public static void main(String[] args) {
		HashMap manage = new HashMap();
		manage.put(100, "�赥��");
		manage.put(200, "�����");
		manage.put(300, "�豸��");
		manage.put(400, "���ڷ�");
		
		System.out.println(manage);
		
		manage.remove(200);
		System.out.println("200�� Ż�� : " + manage);
		
		manage.put(300, "���漺");
		System.out.println("300�� ���� : " + manage);
		
	}
}
