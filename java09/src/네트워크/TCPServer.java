package ��Ʈ��ũ;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class TCPServer {
	// throws Exception : �ش� �޼��带 ȣ���� ������ ����ó���� ���ѱ�
	// try-catch�� ����
	public static void main(String[] args) throws Exception {
		//���ο� ���� ���� �ʿ�
		//���� ������ Ŭ���̾�Ʈ�� ��û�� ��� ��ٸ��ٰ�
		//������ �������� ���ʿ� ������ ���޿� ������ ����
		//�� ������ �����͸� �ְ� ���� �� ����.
		//ip�� ��ǻ�� ����. port�� ���� ���� �� ����.
		ServerSocket server = new ServerSocket(9200);
		System.out.println("���� ���� ���۵�.");
		System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� ��.");
		int count = 0;
		while (true) {
			//��û�� ���� ������ ��. => ���ʿ� ������ �����.
			Socket socket = server.accept();
			count++;
			System.out.println("Ŭ���̾�Ʈ �����.>> " + count + "����");
			//output��Ʈ���� �̿��ؼ� �����͸� Ŭ���̾�Ʈ���� �����غ���.
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			out.println("i am java programmer");
			out.close();
			socket.close();
		}
	}
}