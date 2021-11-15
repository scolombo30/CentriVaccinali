package cittadini;

// EchoMultiServer.java
import centrivaccinali.CentroVaccinale;
import utils.Registrazione;

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
        System.out.println("ServerThread " + id + ": started");

    }

    public void run() {
        //creo la connessione al DB
        try {
            //carico il driver jdbc
            Class.forName("org.postgresql.Driver");
            //creo l'URL per la connessione
            String url = "jdbc:postgresql://localhost/piattaforma_cv_db";
            String user = "postgres";
            String psw = "qwerty99";
            Connection conn = DriverManager.getConnection(url, user, psw);
            while (true) {
                //leggo dal socket cosa devo fare
                String azione = (String) in.readObject();
                if (azione.equals("REGISTRA VACCINATO")) {

                    boolean successo=false;
                    Vaccinato vacc = (Vaccinato) in.readObject();
                    successo=Registrazione.registraVaccinato(conn,vacc);
                    out.writeObject(successo);

                } else if (azione.equals("REGISTRA CENTRO")) {

                    boolean successo=false;
                    CentroVaccinale centro = (CentroVaccinale) in.readObject();
                    successo= Registrazione.registraCentroVaccinale(conn,centro);
                    out.writeObject(successo);

                } else if (azione.equals("REGISTRA CITTADINO")) {
                    boolean successo=false;
                    Cittadino cittadino = (Cittadino) in.readObject();
                    successo=Registrazione.registraCittadino(conn,cittadino);
                    out.writeObject(successo);

                } else if (azione.equals("REGISTRA EVENTO AVVERSO")) {

                    EventoAvverso evento = (EventoAvverso) in.readObject();
                    Registrazione.inserisciEventiAvversi(conn,evento);

                } else if (azione.equals("LOGIN CITTADINO")) {

                    String username = (String) in.readObject();
                    String password = (String) in.readObject();
                    Registrazione.loginCittadino(conn,username,password);
                    //cerco sul db il cittadino con queste credenziali
                    //se lo trovo lo riscrivo al client
                    //out.println(Cittadino)
                } else if (azione.equals("CERCA CENTRO PER NOME")) { //leggo il nome del centro
                    String nome_centro = (String) in.readObject();
                    //cerco sul db i centri con queste lettere
                    Registrazione.cercaCentroVaccinaleNome(conn,nome_centro);
                } else {
                    //leggo comune e tipologia
                    String comune = (String) in.readObject();
                    String tipologia = (String) in.readObject();
                    //cerco sul db i centri nel comune con quel tipo
                    Registrazione.cercaCentroVaccinaleCoTip(conn,comune,tipologia);
                }

            }
            // System.out.println("ServerThread "+id+": closing...");
        } catch (IOException e) {
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        try {
            socket.close();
        } catch (IOException e) {
        }
    }
}

 // ServerThread