package miniprojet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.rmi.Naming;

public class TheatreClient {
    public static void main(String[] args) {
        try {
            // Se connecter au serveur RMI
        	TheatreInterface theatre = (TheatreInterface) Naming.lookup("rmi://localhost/TheatreServer");

            // Se connecter au serveur via un socket TCP
            Socket socket = new Socket("localhost", 1234);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Effectuer une réservation de siège
            boolean reservationReussie = theatre.reserverSiege(5);
            System.out.println("Réservation réussie : " + reservationReussie);

            // Obtenir l'état des sièges
            String[] etatSieges = theatre.obtenirEtatSieges();
            for (int i = 0; i < etatSieges.length; i++) {
                System.out.println("Siège " + i + " : " + etatSieges[i]);
            }

            // Fermer la connexion
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
