package test;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            TemperatureSensorInterface sensor = (TemperatureSensorInterface) Naming.lookup("rmi://localhost:2004/TemperatureSensor");
            sensor.augmenterTemp(10.0);
            
            double temperature = sensor.lire_temp();
            System.out.println("Température : " + temperature);
            sensor.diminuerTemp(70.0);
            
             temperature = sensor.lire_temp();
            System.out.println("Température : " + temperature);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
