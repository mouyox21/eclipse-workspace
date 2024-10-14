package z_tcp_10_04_e2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class servertcp {

    public static void main(String[] args) {

        String ll;
        try {
            ServerSocket serverSocket = new ServerSocket(7090);
            System.out.println("ecoute port 7061....");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connecte via " + clientSocket.getInetAddress().getHostAddress());
            do {
                InputStream inputStream = clientSocket.getInputStream();
                byte[] buffer = new byte[1024];
                int bytesRead = inputStream.read(buffer);
                String request = new String(buffer, 0, bytesRead);
                System.out.println("Recu par Server : " + request);

                String[] numbers = request.split(" ");
                int f = Integer.parseInt(numbers[0]);
                int d = 1;
                for (int i = 1; i <= f; i++) {
                    d = d * i;
                }
                OutputStream outputStream = clientSocket.getOutputStream();
                String response = "Le fact est : " + d + "\n Voulez vous continuer?? Oui/Non";
                outputStream.write(response.getBytes());

                InputStream inputStream2 = clientSocket.getInputStream();
                byte[] buffer2 = new byte[1024];
                int bytesRead2 = inputStream2.read(buffer2);
                String request2 = new String(buffer2, 0, bytesRead2);
                ll = request2.trim();
            } while (ll.equals("oui"));
            System.out.println("server terminer!!");

            clientSocket.close();
            serverSocket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
