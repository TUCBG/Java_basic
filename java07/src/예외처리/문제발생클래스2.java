package ����ó��;

public class �����߻�Ŭ����2 {

	public static void main(String[] args) {
		System.out.println("1. ���� ����Ʈ�� �� �� ����");
		
		try {
			System.out.println("2. �����߻� " + 10/0);
		} catch (Exception e) {
			System.out.println("�����߻�");
			System.out.println(e.getMessage());
		}
		
		System.out.println("3. ����Ʈ�� �ɱ�?");
	}

}
