package mini_chat;

import java.net.*;
import java.util.Scanner;


public class udpclient {

	public static void main(String[] args) throws Exception {
		DatagramSocket clientsocket = new DatagramSocket();
		Scanner sc = new Scanner(System.in);

        byte [] receiveData = new byte[1024];
        byte [] sendData = new byte[1024];

        InetAddress ipAddress = InetAddress.getByName("localhost");

        while (true) {
            // Lecture du message à envoyer
        	
            System.out.print("Entrez un message : ");
            String sentence = sc.nextLine();
            sendData = sentence.getBytes();

            
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,ipAddress,9852);
            clientsocket.send(sendPacket);

            
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientsocket.receive(receivePacket);

            String modifiedSentence = new String(receivePacket.getData());

            
            System.out.println("Réponse du serveur : "+modifiedSentence.trim());

            
            if (sentence.trim().equals("bye")) {
                System.out.println("Chat terminé.");
                break;
            }
        }

        clientsocket.close();

    }

}