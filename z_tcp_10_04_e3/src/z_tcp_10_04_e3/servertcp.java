package z_tcp_10_04_e3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class servertcp {

    public static void main(String[] args) {
        String ll;
        try {
            ServerSocket serverSocket = new ServerSocket(7099);
            System.out.println("ecoute port 7095....");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connecte via " + clientSocket.getInetAddress().getHostAddress());
            do {
                InputStream inputStream = clientSocket.getInputStream();
                byte[] buffer = new byte[1024];
                int bytesRead = inputStream.read(buffer);
                String request = new String(buffer, 0, bytesRead).trim(); 

                System.out.println("Recu par Server : " + request);
                ll = request;
                
               
            } while (!ll.equals("END"));
            System.out.println("server termine!!"); // Correction de "terminer" à "termine"

            clientSocket.close();
            serverSocket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
