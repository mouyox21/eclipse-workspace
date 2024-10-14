package miniprojet;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TheatreInterface extends Remote {

	boolean reserverSiege(int numeroSiege) throws RemoteException;
	String[] obtenirEtatSieges() throws RemoteException;
	
}
