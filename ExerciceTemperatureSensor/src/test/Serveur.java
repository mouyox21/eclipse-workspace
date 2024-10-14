package test;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Serveur {
    public static void main(String[] args) {
        try {
            TemperatureSensor sensor = new TemperatureSensor();
            
            Registry registry = LocateRegistry.createRegistry(2004);
            
            Naming.rebind("rmi://localhost:2004/TemperatureSensor", sensor);
            System.out.println("Serveur prêt !");
        } catch (Exception e) {
        	System.out.println("erreur de server : "+e.toString());
            e.printStackTrace();
        }
    }
}
