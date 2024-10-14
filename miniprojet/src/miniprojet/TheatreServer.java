package miniprojet;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class TheatreServer extends UnicastRemoteObject implements TheatreInterface {
    private List<Boolean> sieges;

    public TheatreServer() throws RemoteException {
        super();
        // Initialisez la liste des sièges (supposons que le théâtre ait 100 sièges)
        sieges = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            sieges.add(true); // true représente un siège libre
        }
    }

    @Override
    public synchronized boolean reserverSiege(int numeroSiege) throws RemoteException {
        if (numeroSiege < 0 || numeroSiege >= sieges.size()) {
            return false; // Si le siège est invalide, renvoyer false
        }
        if (sieges.get(numeroSiege)) {
            sieges.set(numeroSiege, false); // Réserver le siège
            return true; // Renvoyer true pour indiquer que la réservation est réussie
        } else {
            return false; // Si le siège est déjà réservé, renvoyer false
        }
    }

    @Override
    public synchronized String[] obtenirEtatSieges() throws RemoteException {
        String[] etatSieges = new String[sieges.size()];
        for (int i = 0; i < sieges.size(); i++) {
            etatSieges[i] = sieges.get(i) ? "Libre" : "Réservé";
        }
        return etatSieges;
    }

    public static void main(String[] args) {
        try {
            TheatreServer server = new TheatreServer();
            Naming.rebind("TheatreServer", server);
            System.out.println("Serveur prêt.");
        } catch (Exception e) {
            System.err.println("Erreur lors du démarrage du serveur : " + e.toString());
        }
    }
}
