package ��Ʈ��ũ;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReciver {

	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(7100);
		
		byte[] data = new byte[256];
		
		DatagramPacket packet = new DatagramPacket(data, data.length);
		System.out.println("UDP ���� �غ� ��...");
		
		socket.receive(packet);
		System.out.println(new String(data));
		
		socket.close();
	}

}
