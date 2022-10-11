package 네트워크;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args)throws Exception {
		DatagramSocket socket = new DatagramSocket();
		
		InetAddress ip = InetAddress.getByName("localhost");
		
		String str = "i am a ai programmer";
		byte[] data = str.getBytes();
		
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7100);
		
		socket.send(packet);
		socket.close();
	}

}
