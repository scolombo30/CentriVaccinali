package cittadini;

// EchoMultiServer.java
import centrivaccinali.CentroVaccinale;

import java.io.*;
import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class ServerThread extends Thread {
    //dichiarazione variabili
    private static int counter = 0;
    private int id = ++counter;
    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;

    public ServerThread(Socket s) throws IOException {
        //inizializzo varibili per la connessione
        socket = s;
        out = new ObjectOutputStream(s.getOutputStream());
        in = new ObjectInputStream(s.getInputStream());
        start();
        System.out.println("ServerThread "+id+": started");
        //creo la connessione al DB
        try {
            //carico il driver jdbc
            Class.forName("org.postgresql.Driver");
        //creo l'URL per la connessione
        String url = "jdbc:postgresql://localhost/dbProva";
        String user="postgres";
        String password="qwerty";
        Connection conn = DriverManager.getConnection(url, user,password);
        } catch (ClassNotFoundException  e) {
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void run() {
        try {
            while (true) {
                //leggo dal socket cosa devo fare
                String azione=(String) in.readObject();
                if(azione.equals("REGISTRA VACCINATO")){
                    Vaccinato vacc=(Vaccinato) in.readObject();
                }
                else if(azione.equals("REGISTRA CENTRO")){
                    CentroVaccinale centro=(CentroVaccinale) in.readObject();
                  //   Registrazione.registraCentro(conn, centro);
                }
                else if(azione.equals("REGISTRA CITTADINO")){
                    Cittadino cittadino=(Cittadino) in.readObject();
                }
                else if(azione.equals("REGISTRA EVENTO AVVERSO")){
                    EventoAvverso evento=(EventoAvverso) in.readObject();
                }
                else if(azione.equals("LOGIN CITTADINO")){
                    String username=(String) in.readObject();
                    String password=(String) in.readObject();
                    //cerco sul db il cittadino con queste credenziali
                    //se lo trovo lo riscrivo al client
                    //out.println(Cittadino)
                }
                else { //leggo il nome del centro
                    String come_centro =(String) in.readObject();
                    //cerco sul db i centri con queste lettere
                }
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