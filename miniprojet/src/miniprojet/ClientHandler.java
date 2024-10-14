package miniprojet;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientHandler implements Runnable {
    private Socket clientSocket;

    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    public void run() {
        try {
            // Crée les flux de communication avec le client
            ObjectOutputStream output = new ObjectOutputStream(clientSocket.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(clientSocket.getInputStream());

            // Obtient la référence à l'objet distant du serveur RMI
            
            TheatreInterface theatre = (TheatreInterface) Naming.lookup("rmi://localhost:9999/theatre");

            while (true) {
                // Attend la demande du client
                String request = (String) input.readObject();

                if (request.equals("RESERVER")) {
                    int numeroSiege = input.readInt();
                    boolean success = theatre.reserverSiege(numeroSiege);
                    output.writeBoolean(success);
                    output.flush();
                } else if (request.equals("ETAT")) {
                    String[] etatSieges = theatre.obtenirEtatSieges();
                    output.writeObject(etatSieges);
                    output.flush();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
