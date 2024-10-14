package udp;
import java.net.*;

import java.net.DatagramSocket;
import java.time.LocalDateTime;

public class udpclient {

	public static void main(String[] args) throws Exception {
		DatagramSocket clientsocket = new DatagramSocket();
		
		byte [] receiveData = new byte[1024];
		byte [] sendData = new byte[1024];
		
		InetAddress ipAddress = InetAddress.getByName("localhost");
		String sentence = "bonjour";
		sendData = sentence.getBytes();
		
		DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,ipAddress,9879);
		clientsocket.send(sendPacket);
		
		DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
		
		clientsocket.receive(receivePacket);
		
		String modifiedSentence = new String(receivePacket.getData());
		
		System.out.println("Recu : "+modifiedSentence.trim() );
		
		clientsocket.close();

	}

}
