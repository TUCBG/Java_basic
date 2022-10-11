package ��Ʈ��ũ;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.xml.soap.SOAPException;
public class �޽���A extends JFrame{
	DatagramSocket socket;
	JTextArea list; //ä�� ���� ����Ʈ
	JTextField input; //ä�� ���� �Է�
	
	public �޽���A() throws Exception {
		//�޴� ���� ���������.
		socket = new DatagramSocket(7777);
		setTitle("�޽���A");
		setSize(500, 500);
		list = new JTextArea();
		input = new JTextField();
		
		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);
		
		Font font = new Font("�ü�", Font.BOLD, 30);
		list.setFont(font);
		input.setFont(font);
		
		//����
		list.setBackground(Color.black);
		input.setBackground(Color.gray);
		
		//���ڻ�
		list.setForeground(Color.white);
		input.setForeground(Color.black);
		
		//list�� �����Ұ�
		list.setEditable(false);
		
		                      //new �͸�Ŭ����(){}
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//list append
				list.append("��>> " + input.getText() + "\n");
				
				//socket�� ���� packet�� ����.
				// UDP socket�ʿ�
				try {
					DatagramSocket socket = new DatagramSocket();
					
					// packet�� ip, port, data�� �Ǿ������.
					// ip�� �ش� ��ǰ���� ������־�� ��.
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					// packet�� �����ʹ� byte�迭�� ���� ������ �Ѵ�.
					String str = input.getText();
					byte[] data = str.getBytes();
					
					// UDP packet�ʿ�
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 5555);
					
					// socket�� �̿��ؼ� packet�� ������.
					socket.send(packet);
					socket.close();
					
					input.setText("");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		setVisible(true);
		
	}
	
	public void process() throws Exception {
		while (true) {
			// ���� �� byte�迭�� �޴´�.
			byte[] data = new byte[256];
			// �̸� �޾Ƽ� ������� byte�迭�� �������ƾ� �Ѵ�.
			
			// ���� ��Ŷ�� ��������.
			DatagramPacket packet = new DatagramPacket(data, data.length);
			// ��Ŷ�� ����.
			socket.receive(packet);
			
			// ���� �����͸� ��Ʈ���� ��ȯ�ؼ� ����Ʈ�غ���.
			//System.out.println(new String(data));
			list.append("��>> " + new String(data) + "\n");
			
			//socket.close();
		}
	}
	public static void main(String[] args) throws Exception {
		�޽���A name = new �޽���A();
		name.process();//�޴� �� ���� ����!!
	}
}