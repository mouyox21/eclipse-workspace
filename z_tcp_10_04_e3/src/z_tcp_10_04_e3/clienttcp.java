package z_tcp_10_04_e3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class clienttcp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Socket socket = new Socket("localhost", 7099);
            String a, b;
            do {
                do {
                    System.out.println("Donner un nombre : ");
                    a = sc.nextLine();
                } while (!a.equals("TIC")&& !a.equals("TAC")&& !a.equals("END"));
                System.out.println("cc");

                OutputStream outputStream = socket.getOutputStream();
                String message = a ;
                outputStream.write(message.getBytes());
                
                // Attendre la réponse du serveur
             /*   InputStream inputStream = socket.getInputStream();
                byte[] buffer = new byte[1024];
                int bytesread = inputStream.read(buffer);
                String response = new String(buffer, 0, bytesread).trim(); // ajout de trim() pour supprimer les espaces blancs
                System.out.println("reponse du serveur : "+response);*/

            } while (!a.equals("END"));
            System.out.println("client termine!!"); // Correction de "terminer" à "termine"
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
