package tcp_socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Socket socket = new Socket("localhost", 7065);
            String a, b;
            int t, g = 0;

            do {
                System.out.println("Donner le premier nombre : ");
                a = sc.nextLine();

                System.out.println("Donner le deuxième nombre : ");
                b = sc.nextLine();
                t = 0;
                int ch;
                System.out.println("donner l'opération voulue :");
                System.out.println("1. + \t 2. - \t 3. x \t 4. /");
                ch = sc.nextInt();
                
                switch (ch) {
                    case 1:
                        t = 1;
                        break;
                    case 2:
                        t = 2;
                        break;
                    case 3:
                        t = 3;
                        break;
                    case 4:
                        t = 4;
                        break;
                    
                }
                if ((b.equals("0") && t == 4) || (t > 4 || t < 1)) {
                    g = 1;
                    sc.nextLine();
                } else {
                    g = 0;
                }
            } while (!(a.matches("-?\\d+") && b.matches("-?\\d+") && g != 1));

            OutputStream outputStream = socket.getOutputStream();
            String message = a + " " + b + " " + t;
            outputStream.write(message.getBytes());

            InputStream inputStream = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int bytesread = inputStream.read(buffer);
            String response = new String(buffer, 0, bytesread);
            System.out.println("Reçu par Client : " + response);

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
