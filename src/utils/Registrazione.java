package utils;

import centrivaccinali.CentroVaccinale;
import cittadini.Cittadino;
import cittadini.EventoAvverso;
import cittadini.Vaccinato;

import java.sql.Connection;
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
            String query_crea_centri="CREATE TABLE IF NOT EXISTS CentriVaccinali ("+
                                      "Nome_Centro VARCHAR(30) PRIMARY KEY,"+
                                      "Tipologia VARCHAR(11))";
            st.executeUpdate(query_crea_centri);
            //creo query di creazione tabella Indirizzi se non esiste già
            String query_crea_indirizzi="CREATE TABLE IF NOT EXISTS Indirizzi ("+
                                        "Centro VARCHAR(30) REFERENCES CentriVaccinali(Nome_Centro),"+
                                        "Qualificatore VARCHAR(7),"+
                                        "Nome_via VARCHAR(15),"+
                                        "Numero_civico VARCHAR(5),"+
                                        "Comune VARCHAR(15),"+
                                        "Provincia VARCHAR(2),"+
                                        "Cap VARCHAR(5),"+
                                        "PRIMARY KEY (Centro))";
            st.executeUpdate(query_crea_indirizzi);
            //creo query di inserimento dati in CentriVaccinali
            String query_inserisci_centro = "INSERT INTO CentriVaccinali VALUES ('"+nome+"','"+tipologia+"')";
            st.executeUpdate(query_inserisci_centro);
            //creo query di inserimento dati in Indirizzi
            String query_inserisci_indirizzi="INSERT INTO Indirizzi VALUES ('"+nome+"','"+qualificatore+"','"+nomeVia+"','"
                                            +numeroCivico+"','"+comune+"','"+siglaProvincia+"','"+cap+"')";
            st.executeUpdate(query_inserisci_indirizzi);
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
            String centroVaccinale= vaccinato.getCentroVaccinale().replaceAll("\\s","_");
        String nome=vaccinato.getNome();
        String cognome=vaccinato.getCognome();
        String cod_fisc=vaccinato.getCodiceFiscale();
        DataLab data=vaccinato.getDataSomministrazione();
        String tipo_vaccino=vaccinato.getVaccino();
        int id_vaccinazione=vaccinato.getIdVaccinazione();

        try {
            //creo lo statement
            Statement st= conn.createStatement();
            //creo il nome della tabella dinamicamente in base al centro vaccinale
            String nomeTabella="Vaccinati_"+centroVaccinale;
            //Anno-mese-giorno. Creo la data
            String data_query=data.getAnno()+"-"+data.getMese()+"-"+data.getGiorno();
            //creo query di creazione tabella se non è già presente nel DB
            String query_creazione="CREATE TABLE IF NOT EXISTS "+nomeTabella+"("+
                                    "Nome VARCHAR(20),"+
                                    "Cognome VARCHAR(20),"+
                                    "Codice_fiscale VARCHAR(16),"+
                                    "Data DATE,"+
                                    "Tipologia_vaccino VARCHAR(10),"+
                                    "Id_vax NUMERIC(16) PRIMARY KEY,"+
                                    "Nome_centro VARCHAR(20))";
            st.executeUpdate(query_creazione);
            //creo query di inserimento dati nella tabella appena creata
            String query_insert_vaccinato="INSERT INTO "+nomeTabella+ " VALUES ('"+nome+"', '"+cognome+"', '"+cod_fisc+"', '"
                    +data_query+"', '"+tipo_vaccino+"', '"+id_vaccinazione+"', '"+centroVaccinale+"')";
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
    public static boolean registraCittadino(Connection conn, Cittadino cittadino ){
        //controllare schema er e vedere se funziona
        //tab Cittadini_Registrati
         String nome=cittadino.getNome();
         String cognome= cittadino.getCognome();
         String codiceFiscale=cittadino.getCodiceFiscale();
         int idVaccinazione=cittadino.getIdVaccinazione();
         String mail=cittadino.getMail();
         String username=cittadino.getUsername();
         String password=cittadino.getPassword();
         try{
             //creo lo statement
             Statement st= conn.createStatement();
             //creo query di creazione tabella se non è già presente nel DB
             String query_crea_cittadino="CREATE TABLE IF NOT EXISTS Cittadini_Registrati("+
                     "Nome VARCHAR(20),"+
                     "Cognome VARCHAR(20),"+
                     "Codice_fiscale VARCHAR(16),"+
                     "Id_vax NUMERIC(16) PRIMARY KEY,"+
                     "mail VARCHAR(40),"+
                     "username VARCHAR(20),"+
                     "password VARCHAR(20))";
             st.executeUpdate(query_crea_cittadino);
             //creo query di inserimento dati in cittadino
             String query_inserisci_cittadino = "INSERT INTO Cittadini_Registrati VALUES ('"+nome+"', '"+cognome+"', '"+codiceFiscale+"', '"+idVaccinazione+"','"+mail+"','"+username+"','"+password+"')";

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
    public static void loginCittadino(Connection conn,String username,String password){}
    //metodo cerca centro vaccinale x nome
    public static void cercaCentroVaccinaleNome(Connection conn,String nome){}
    //metodo cerca centro vaccinale x comune, tipologia
    public static  void cercaCentroVaccinaleCoTip(Connection conn,String comune, String tipologia){}
    //metodo inserisci evento avverso
    public static void inserisciEventiAvversi(Connection conn, EventoAvverso evento){}
    //metodo visualizza info
    public static void visualizzaInfoCentroVaccinale(Connection conn){}

}
