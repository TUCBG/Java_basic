package ����static;

import ����static.����;

public class ȸ��â�� {
	public static void main(String[] args) {
		���� work1 = new ����("ȫ�浿", 25, "��");
		
		
		���� work2 = new ����("��浿", 24, "��");
		
		
		���� work3 = new ����("�۱浿", 26, "��");	
		
		//1) ȸ�� ������ ��
		System.out.println("������ �� : " + ����.count);
		
		//2) ȸ�� ���� ������ ���� ����Ʈ
		System.out.println(work1);
		System.out.println(work2);
		System.out.println(work3);
		
		//3) ȸ�� ���� ��� ����
		System.out.println("��� ���� : " + ����.avgAge());
	}

}
