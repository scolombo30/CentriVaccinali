package cittadini;

// EchoMultiServer.java
import centrivaccinali.CentroVaccinale;

import java.io.*;
import java.net.*;
class ServerThread extends Thread {
    private static int counter = 0;
    private int id = ++counter;
    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;

    public ServerThread(Socket s) throws IOException {
        socket = s;
        out = new ObjectOutputStream(s.getOutputStream());
        in = new ObjectInputStream(s.getInputStream());
        start();
        System.out.println("ServerThread "+id+": started");
    }
    public void run() {
        try {
            while (true) {
                Vaccinato str =(Vaccinato) in.readObject();
                //if (str.equals("END")) break;
               // System.out.println("ServerThread "+id+": echoing -> " + str);
                System.out.println("Ho letto dal socket: \n");
                System.out.println(str);
               // out.writeObject(str);
            }
          //  System.out.println("ServerThread "+id+": closing...");
        } catch (IOException e) {} catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            socket.close();
        } catch(IOException e) {}
    }
} // ServerThread