//Davide Franco "741453" CO
// Sebastian Colombo "742779" CO
package cittadini;
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
    private String username;
    private String password;

    public ServerThread(Socket s, String arg [] ) throws IOException {
        //inizializzo varibili per la connessione
        socket = s;
        out = new ObjectOutputStream(s.getOutputStream());
        in = new ObjectInputStream(s.getInputStream());
        //username=arg[0];
        //password=arg[1];
        username="postgres";
        password="qwerty";
        start();
        System.out.println("ServerThread " + id + ": started");

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
                    boolean successo=false;
                    EventoAvverso evento = (EventoAvverso) in.readObject();
                    successo=Registrazione.inserisciEventiAvversi(conn,evento);
                    out.writeObject(successo);

                } else if (azione.equals("LOGIN CITTADINO")) {
                    User utente = (User) in.readObject();
                    //cerco sul db lo user con queste credenziali
                    User user_return=Registrazione.loginCittadino(conn,utente);
                    //se lo trovo lo riscrivo al client
                    out.writeObject(user_return);
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