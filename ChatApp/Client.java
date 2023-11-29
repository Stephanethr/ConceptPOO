package ChatApp;

import java.net.Socket;
import java.io.BufferedReader;
import java.net.InetAddress;
import java.io.InputStreamReader;
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket(InetAddress.getLocalHost(), 2000);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(in.readLine());
            socket.close();
        } catch (Exception e) {
            System.out.println("Erreur : " + e);
        }
    }
}
