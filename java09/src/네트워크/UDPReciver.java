package 네트워크;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReciver {

	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(7100);
		
		byte[] data = new byte[256];
		
		DatagramPacket packet = new DatagramPacket(data, data.length);
		System.out.println("UDP 받을 준비 중...");
		
		socket.receive(packet);
		System.out.println(new String(data));
		
		socket.close();
	}

}
