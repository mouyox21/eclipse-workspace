package serverrmi;

import java.rmi.RemoteException;

public class SommeImpl implements Somme{
	

	
	public String Hello(String nom) throws RemoteException {
		// TODO Auto-generated method stub
		return "Bonjour "+nom+" !";
	}

	
	public int add(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return a+b;
	}

}
