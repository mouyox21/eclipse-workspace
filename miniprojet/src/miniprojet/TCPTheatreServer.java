package miniprojet;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPTheatreServer {
    private static final int PORT = 8888;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Serveur TCP en attente de connexions...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Nouvelle connexion entrante : " + clientSocket);

                // Crée un thread distinct pour gérer la communication avec le client
                Thread clientThread = new Thread(new ClientHandler(clientSocket));
                clientThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
