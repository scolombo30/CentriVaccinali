//Davide Franco "741453" CO
// Sebastian Colombo "742779" CO
package utils;
import centrivaccinali.CentroVaccinale;
import cittadini.Cittadino;
import cittadini.EventoAvverso;
import cittadini.User;
import cittadini.Vaccinato;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public  class Registrazione {

    public Registrazione() {}
    //metodo registra centro vaccinale sul db
    public static boolean registraCentroVaccinale(Connection conn, CentroVaccinale centro){
        //tab CentriVaccinali
        //creo tabella CentriVaccinali e tabella indirizzi con foreign key la chiave primaria dei CentriVaccinali
        String nome=centro.getNome();
        String tipologia=centro.getTipologia();
        String qualificatore=centro.getIndirizzo().getQualificatore();
        String nomeVia=centro.getIndirizzo().getNome();
        String numeroCivico=centro.getIndirizzo().getNumeroCivico();
        String comune=centro.getIndirizzo().getComune();
        String siglaProvincia=centro.getIndirizzo().getSiglaProvincia();
        String cap=centro.getIndirizzo().getCAP();

        try{
            //creo lo statement
            Statement st= conn.createStatement();
            //creo query di creazione tabelle CentriVaccinali se nonn esiste già
            String query_crea_centri=SqlString.CreaTabellaCentro();
            //update per la tabella
            st.executeUpdate(query_crea_centri);
            //creo query di inserimento dati in CentriVaccinali
            String query_inserisci_centro = "INSERT INTO CentriVaccinali VALUES ('"+nome+"','"+tipologia+"','"+qualificatore+"','"+nomeVia+"','"
                    +numeroCivico+"','"+comune+"','"+siglaProvincia+"','"+cap+"')";
            st.executeUpdate(query_inserisci_centro);
            //se non ci sono stati errori ritorno vero
            return true;
        }catch(Exception e){
            e.printStackTrace();
            //se ci sono stati errori ritono falso
            return false;
        }
        }
    //metodo registra vaccianto su db
    public static boolean registraVaccinato(Connection conn, Vaccinato vaccinato) {
        //campi da inserire nella tabella
            //visto che il nome del centro diventa anche nome della tabella non può avere spazi, li sostituisco con "_"
        String centroVacci= vaccinato.getCentroVaccinale().replaceAll("\\s","_");
        String comune_centro=vaccinato.getComuneCentro();
        String nomecentro=vaccinato.getCentroVaccinale();
        String nome=vaccinato.getNome();
        String cognome=vaccinato.getCognome();
        String cod_fisc=vaccinato.getCodiceFiscale();
        DataLab data=vaccinato.getDataSomministrazione();
        String tipo_vaccino=vaccinato.getVaccino();
        long id_vaccinazione=vaccinato.getIdVaccinazione();

        try {
            //creo lo statement
            Statement st= conn.createStatement();
            //creo il nome della tabella dinamicamente in base al centro vaccinale
            String nomeTabella="Vaccinati_"+centroVacci;
            //Anno-mese-giorno. Creo la data
            String data_query=data.getAnno()+"-"+data.getMese()+"-"+data.getGiorno();
            //creo query di creazione tabella se non è già presente nel DB
            String query_crea_vaccinato=SqlString.CreaTabellaVaccinato(nomeTabella);
            //update per la tabella
            st.executeUpdate(query_crea_vaccinato);
            //creo query di inserimento dati nella tabella appena creata
            String query_insert_vaccinato="INSERT INTO "+nomeTabella+" VALUES ('"+nome+"', '"+cognome+"', '"+cod_fisc+"', " +
                    "'" +data_query+"', '"+tipo_vaccino+"', '"+id_vaccinazione+"', '"+nomecentro+"','"+comune_centro+"')";
            st.executeUpdate(query_insert_vaccinato);
            //se non ci sono stati errori ritorno vero
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            //se ci sono stati errori ritorno falso
            return false;
        }
    }
    //metodo registra cittadino su db
    public static boolean registraCittadino(Connection conn, Cittadino cittadino){
         //tab Cittadini_Registrati
         String nome=cittadino.getNome();
         String cognome= cittadino.getCognome();
         String codiceFiscale=cittadino.getCodiceFiscale();
         long idVaccinazione=cittadino.getIdVaccinazione();
         //String mail=user1.getMail();
         String username=cittadino.getUser().getUsername();
         String password=cittadino.getUser().getPassword();
         try{
             //creo lo statement
             Statement st= conn.createStatement();
             //creo query di creazione tabella users se non è già presente nel DB
             String query_crea_user=SqlString.CreaTabellaUser();
             //update per la tabella
             st.executeUpdate(query_crea_user);
             //inserisco dati in users
             String query_inserisci_user="INSERT INTO Users VALUES ('"+username+"', '"+password+"')";
             st.executeUpdate(query_inserisci_user);
             //creo query di creazione tabella cittadini se non è già presente nel DB
             String query_crea_cittadino=SqlString.CreaTabellaCittadino();
             st.executeUpdate(query_crea_cittadino);
             //creo query di inserimento dati in cittadino
             String query_inserisci_cittadino = "INSERT INTO Cittadini_Registrati VALUES ('"+idVaccinazione+"', '"+nome+"', '"+cognome+"', '"+codiceFiscale+"','"+username+"','"+password+"')";
             st.executeUpdate(query_inserisci_cittadino);


             //se non ci sono stati errori ritorno vero
             return true;
         } catch (SQLException e) {
             e.printStackTrace();
             //se ci sono stati errori ritono falso
             return false;
         }
    }
    //login sulla piattaforma
    public static User loginCittadino(Connection conn,User utente){
        String user= utente.getUsername();
        String psw= utente.getPassword();
        User user_return=null;
        try{
            //creo lo statement
            Statement st= conn.createStatement();
            //creo query di select cittadino con queste credenziali
            String query_ricerca= "SELECT * FROM Users WHERE Username='"+user+"' AND Password='"+psw+"';";
            //update per la tabella
            ResultSet rs = st.executeQuery(query_ricerca);
            while(rs.next()){
                String user_result = rs.getString("Username");
                String psw_result = rs.getString("Password");
                user_return=new User(user_result,psw_result);
            }
            return user_return;
        } catch (SQLException e) {
            e.printStackTrace();
            return user_return;
        }

    }
    //metodo cerca centro vaccinale x nome
    public static void cercaCentroVaccinaleNome(Connection conn,String nome){}
    //metodo cerca centro vaccinale x comune, tipologia
    public static  void cercaCentroVaccinaleCoTip(Connection conn,String comune, String tipologia){}
    //metodo inserisci evento avverso
    public static boolean inserisciEventiAvversi(Connection conn, EventoAvverso evento){
    String tipologia=evento.getTipologia();
    String note=evento.getNote();
    short gravità= evento.getGravità();
    String username= evento.getUser().getUsername();
    String password= evento.getUser().getPassword();
    try{
        //creo lo statement
        Statement st= conn.createStatement();
        //creo query di creazione tabella se non è già presente nel DB
        String query_crea_evento=SqlString.CreaTabellaEvento();
        //update per tabella
        st.executeUpdate(query_crea_evento);
        //creo query di inserimento dati in eventi_avversi
        String query_inserisci_evento ="INSERT INTO Eventi_avversi VALUES ('"+tipologia+"', '"+gravità+"', '"+note+"', '"+username+"', '"+password+"')";
        st.executeUpdate(query_inserisci_evento);
        //se non ci sono errori ritorno vero
        return true;
    }catch(SQLException e){
        e.printStackTrace();
        return false;
    }
    }
    //metodo visualizza info
    public static void visualizzaInfoCentroVaccinale(Connection conn){}

}
