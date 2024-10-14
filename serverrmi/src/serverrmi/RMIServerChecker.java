package serverrmi;

import java.rmi.Naming;

public class RMIServerChecker {
    public static void main(String[] args) {
        try {
            // Tente de se connecter au serveur RMI à l'URL spécifiée
            Somme stub = (Somme) Naming.lookup("rmi://localhost:9900/AA");
            System.out.println("Connexion réussie au serveur RMI.");
        } catch (Exception e) {
            System.out.println("Impossible de se connecter au serveur RMI : " + e.getMessage());
        }
    }
}
