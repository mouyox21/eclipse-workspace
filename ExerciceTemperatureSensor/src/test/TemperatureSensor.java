package test;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;



public class TemperatureSensor extends UnicastRemoteObject  implements TemperatureSensorInterface {
    private double temperature;

    public TemperatureSensor() throws RemoteException {
        temperature = 0.0;
    }

    
    public void augmenterTemp(double tempVal) throws RemoteException {
        temperature += tempVal;
    }

    
    public void diminuerTemp(double tempVal) throws RemoteException {
        temperature -= tempVal;
    }

    
    public double lire_temp() throws RemoteException {
        return temperature;
    }
}
