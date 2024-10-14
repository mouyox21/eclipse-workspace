package z_tcp_10_04_e2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class clienttcp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Socket socket = new Socket("localhost", 7090);
            String a, b;
            do {
                do {
                    System.out.println("Donner un nombre : ");
                    a = sc.nextLine();
                } while (!a.matches("-?\\d+"));

                OutputStream outputStream = socket.getOutputStream();
                String message = a + " ";
                outputStream.write(message.getBytes());

                InputStream inputStream = socket.getInputStream();
                byte[] buffer = new byte[1024];
                int bytesread = inputStream.read(buffer);
                String response = new String(buffer, 0, bytesread);
                System.out.println("Recu par Client : " + response);

                b = sc.nextLine();
                OutputStream outputStream2 = socket.getOutputStream();
                String message2 = b;
                outputStream2.write(message2.getBytes());
            } while (b.equals("oui"));
            System.out.println("client terminer!!");
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
