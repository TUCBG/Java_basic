package ��Ʈ��ũ;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
public class TCPClients {
	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 100; i++) {
			//Ŭ���̾�Ʈ�� ������ ������ ���ι�����
			//���ʿ� ������ ����
			Socket socket = new Socket("localhost", 9200);
			System.out.println("Ŭ���̾�Ʈ�� ������.>> " + i);
			//input��Ʈ���� ���� ������ �ͼ� �ӽñ����ġ�� �־����.
			//��Ʈ��(1byte) ---  ��Ʈ������(�긴��Ŭ����)  --> �ӽñ����ġ(2byte)
			BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String data = buffer.readLine(); //���پ� ������ �� �� ����.(2����Ʈ)
			System.out.println("�������� �޾ƿ� �����ʹ� " + data);
		}
	}
}