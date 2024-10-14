package serverrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Somme extends Remote { 
public String Hello(String nom) throws RemoteException;
public int add(int a, int b) throws RemoteException; }