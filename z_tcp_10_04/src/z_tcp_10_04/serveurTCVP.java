package z_tcp_10_04;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class serveurTCVP {

	public static void main(String[] args) {
			
		 try {
	            ServerSocket serverSocket = new ServerSocket(7099);
	            System.out.println("ecoute port 7099....");

	            Socket clientSocket = serverSocket.accept();
	            System.out.println("Client connecte via " + clientSocket.getInetAddress().getHostAddress());

	            InputStream inputStream = clientSocket.getInputStream();
	            byte[] buffer = new byte[1024];
	            int bytesRead = inputStream.read(buffer);
	            String request = new String(buffer, 0, bytesRead);
	            System.out.println("Recu par Server !! ");
	            
	            if(request != "") {
	            	
		            OutputStream outputStream = clientSocket.getOutputStream();
		            String response = "requete recu " ;
		            outputStream.write(response.getBytes());

	            }

	            
	            clientSocket.close();
	            serverSocket.close();

	        } catch (Exception e) {
	            e.printStackTrace();

	        }
	    }

	}


