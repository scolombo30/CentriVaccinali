//Davide Franco "741453" CO
// Sebastian Colombo "742779" CO
package cittadini;

import centrivaccinali.CentroVaccinale;
import utils.Registrazione;
import utils.SqlString;
import java.io.*;
import java.net.*;
import java.sql.*;
import java.util.LinkedList;

class ServerThread extends Thread {
    //dichiarazione variabili
    private static int counter = 0;
    private int id = ++counter;
    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private String username;
    private String password;

    public ServerThread(Socket s, String arg [] ) throws IOException {
        //inizializzo varibili per la connessione
        socket = s;
        out = new ObjectOutputStream(s.getOutputStream());
        in = new ObjectInputStream(s.getInputStream());
        username=arg[0];
        password=arg[1];
        //username="postgres";
        //password="qwerty";
        start();
        System.out.println("ServerThread " + id + ": started");

    }
    private String controlla_apostrofo(String str){
        return str.replace("'","''");
    }

    public void run() {
        //creo la connessione al DB
        try {
            //carico il driver jdbc
            Class.forName("org.postgresql.Driver");
            //creo l'URL per la connessione
            String url = "jdbc:postgresql://localhost/piattaformacv";
            String user = username ;
            String psw = password ;
            Connection conn = DriverManager.getConnection(url, user, psw);
            while (true) {
                //leggo dal socket cosa devo fare
                String azione = (String) in.readObject();
                String c=azione;
                if (azione.equals("REGISTRA VACCINATO")) {

                    int risultato;
                    Vaccinato vacc = (Vaccinato) in.readObject();
                    risultato=Registrazione.registraVaccinato(conn,vacc);
                    out.writeObject(risultato);

                } else if (azione.equals("REGISTRA CENTRO")) {

                    boolean successo;
                    CentroVaccinale centro = (CentroVaccinale) in.readObject();
                    successo= Registrazione.registraCentroVaccinale(conn,centro);
                    out.writeObject(successo);

                } else if (azione.equals("REGISTRA CITTADINO")) {
                    int risultato;
                    Cittadino cittadino = (Cittadino) in.readObject();
                    risultato=Registrazione.registraCittadino(conn,cittadino);
                    out.writeObject(risultato);

                } else if (azione.equals("REGISTRA EVENTO AVVERSO")) {
                    boolean successo;
                    EventoAvverso evento = (EventoAvverso) in.readObject();
                    successo=Registrazione.inserisciEventiAvversi(conn,evento);
                    out.writeObject(successo);

                } else if (azione.equals("LOGIN CITTADINO")) {
                    User utente = (User) in.readObject();
                    //cerco sul db lo user con queste credenziali
                    User user_return=Registrazione.loginCittadino(conn,utente);
                    //se lo trovo lo riscrivo al client
                    out.writeObject(user_return);

                } else if (azione.equals("CERCA CENTRO PER NOME")) {
                    //leggo il nome del centro
                    String nome_centro = (String) in.readObject();
                    //cerco sul db i centri con queste lettere
                    LinkedList<CentroVaccinale> lista = Registrazione.cercaCentroVaccinaleNome(conn,nome_centro);
                    //scrivo sul socket la lista dei centri che ha trovato
                    out.writeObject(lista);

                } else if(azione.equals("CERCA CENTRO PER COMUNE")){
                    //leggo comune e tipologia
                    String comune = (String) in.readObject();
                    String tipologia = (String) in.readObject();
                    //cerco sul db i centri nel comune con quel tipo
                    LinkedList<CentroVaccinale> lista = Registrazione.cercaCentroVaccinaleCoTip(conn,comune,tipologia);
                    //scrivo sul socket la lista dei centri che ha trovato
                    out.writeObject(lista);
                } else if (azione.equals("CERCA EVENTO")){
                    //leggo il nome del centro di cui dovrò vedere gli eventi avversi
                    CentroVaccinale centro=(CentroVaccinale)in.readObject();
                    //cerco sul db i vari eventi avversi accaduti nel centro
                    String [][] info=Registrazione.infoEventiAvversi(conn,controlla_apostrofo(centro.getNome()),controlla_apostrofo(centro.getIndirizzo().getComune()));
                    //scrivo sul socket le info dei vari eventi e gravità
                    out.writeObject(info);
                } else if (azione.equals("CODICE OPERATORE")){
                    boolean successo;
                    String codice =(String) in.readObject();
                    successo=Registrazione.controllaCodiceOperatore(conn,codice);
                    out.writeObject(successo);
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