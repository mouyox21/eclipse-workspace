package z_tcp_10_04;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class clienttcp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        try {
            Socket socket = new Socket("localhost", 7099);
            String a;
           
        	   
        	   System.out.println("Donner le premier nombre : ");
               a= sc.nextLine();

            OutputStream outputStream = socket.getOutputStream();
            String message = a; 
            outputStream.write(message.getBytes());
            
            InputStream inputStream = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int bytesread = inputStream.read(buffer);
            String response = new String(buffer, 0, bytesread);
            System.out.println("Recu par Client : " + response);

           
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
