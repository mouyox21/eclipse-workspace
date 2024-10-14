package test;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TemperatureSensorInterface extends Remote {
    void augmenterTemp(double tempVal) throws RemoteException;
    void diminuerTemp(double tempVal) throws RemoteException;
    double lire_temp() throws RemoteException;
}

