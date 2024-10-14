package tcp_socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(7065);
            System.out.println("Ecoute sur le port 7065...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connecté via " + clientSocket.getInetAddress().getHostAddress());

            InputStream inputStream = clientSocket.getInputStream();
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String request = new String(buffer, 0, bytesRead);
            System.out.println("Reçu par le serveur : " + request);

            String[] numbers = request.split(" "); 

            float result;
            String response;
            switch (numbers[2]) {
                case "1":
                    result = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
                    response = "La somme des deux nombres est : " + result;
                    break;
                case "2":
                    result = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
                    response = "La différence des deux nombres est : " + result;
                    break;
                case "3":
                    result = Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]);
                    response = "Le produit des deux nombres est : " + result;
                    break;
                case "4":
                    result = Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]);
                    response = "La division des deux nombres est : " + result;
                    break;
                default:
                    response = "Opération inconnue";
                    break;
            }

            OutputStream outputStream = clientSocket.getOutputStream();
            outputStream.write(response.getBytes());

            clientSocket.close();
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
