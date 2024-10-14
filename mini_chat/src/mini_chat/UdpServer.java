package mini_chat;

import java.net.*;
		import java.time.LocalDateTime;
import java.util.Scanner;
public class UdpServer {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);

		        DatagramSocket serversocket = new DatagramSocket(9852);

		        byte [] receiveData = new byte[1024];
		        byte [] sendData = new byte[1024];

		        while (true) {
		        	
		            // Réception du message du client
		            DatagramPacket receivPacket = new DatagramPacket(receiveData, receiveData.length);
		            serversocket.receive(receivPacket);
		            String sentence =  new String(receivPacket.getData());

		            
		          /* if (sentence.trim().equals("bye")) {
		                System.out.println("Chat terminé.");
		                break;
		            }*/

		       
		            System.out.println("Message du client : " + sentence.trim());

		           
		            InetAddress iPAddress = receivPacket.getAddress();
		            int port = receivPacket.getPort();
		            LocalDateTime now = LocalDateTime.now();
		            
		            System.out.print("Entrez un message : ");
		            String response = sc.nextLine();
		            
		            // response = "Réponse au message '" + sentence.trim() + "'. Reçu à " + now.toString();
		            sendData = response.getBytes();
		            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, iPAddress, port);

		            // Envoi de la réponse
		            serversocket.send(sendPacket);
		        }

		        //serversocket.close();


	}

}
