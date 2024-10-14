package miniprojet;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class TheatreReservationSystem {
    public static void main(String[] args) {
        try {
            // Crée et exporte l'objet distant du serveur RMI
            TheatreInterface theatre = new TheatreServer();
            Registry registry = LocateRegistry.createRegistry(9999);
            
           Naming.rebind("rmi://localhost:9999/theatre", theatre);

            System.out.println("Serveur RMI démarré.");

            // Lance le serveur TCP
            TCPTheatreServer.main(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

