package centrivaccinali;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerCV {

    //campi
    private static ServerSocket server;
    //porta dove il serversocket ascolterà
    private static int PORT = 2812;

    public static void main(String[] args) throws IOException {
        //creo il serverSocket
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Avviato: " + serverSocket);
        //rimango in ascolto per le possibili connesioni da parte dei client
        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.println("In attesa di Client...");
            Socket socket = serverSocket.accept();
            //a ogni client che si collega avvio un thread
            new Thread(new LogicaServer(socket)).start();
        }
    }



    //lancia logica del server(thread da lanciare)
}
