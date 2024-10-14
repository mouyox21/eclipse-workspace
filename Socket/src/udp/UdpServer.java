package udp;
import java.net.*;
import java.time.LocalDateTime;


public class UdpServer {

	public static void main(String[] args) throws Exception {
		
		DatagramSocket serversocket = new DatagramSocket(9879);
		
		byte [] receiveData = new byte[1024];
		byte [] sendData = new byte[1024];
		while (true) {
			DatagramPacket receivPacket = new DatagramPacket(receiveData, receiveData.length);
			serversocket.receive(receivPacket);
			String sentence =  new String(receivPacket.getData());
			
			if(sentence.trim().equals("bonjour")) {
				System.out.println("recu:" + sentence.trim());
				
				InetAddress iPAddress = receivPacket.getAddress();
				int port = receivPacket.getPort();
				LocalDateTime now = LocalDateTime.now();
				String response = "bonjour, ca va. Reçu à " + now.toString();
				//String response = "bonjour, ca va";
				
				sendData = response.getBytes();
				DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, iPAddress, port);
				
				serversocket.send(sendPacket);
			}
		}
	}

}
