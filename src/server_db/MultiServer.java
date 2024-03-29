//Davide Franco "741453" CO
// Sebastian Colombo "742779" CO
package server_db;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {
    static final int PORT = 2812;
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Server: started");
        System.out.println("Server Socket: " + serverSocket);
        try {
            while(true) {
                // bloccante finchè non avviene una connessione:
                Socket clientSocket = serverSocket.accept();
                System.out.println("Connection accepted: "+ clientSocket);
                try {
                    new ServerThread(clientSocket,args);
                } catch(IOException e) {
                    clientSocket.close();
                }
            }
        }
        catch (IOException e) {
            System.err.println("Accept failed");
            System.exit(1);
        }
        System.out.println("Server: closing...");
        serverSocket.close();
    }
} // EchoMultiServer