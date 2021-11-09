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
    public static void registraCentroVaccinale(Connection conn, CentroVaccinale centro){
        //tab CentriVaccinali
        }
    //metodo registra vaccianto su db
    public static void registraVaccinato(Connection conn, Vaccinato vaccinato) {
        //campi da inserire nella tabella
        String centroVaccinale= vaccinato.getCentroVaccinale();
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

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //metodo registra cittadino su db
    public static void registraCittadino(Connection conn, Cittadino cittadino ){
        //tab Cittadini_Registrati
         String nome=cittadino.getNome();
         String cognome= cittadino.getCognome();
         String codiceFiscale=cittadino.getCodiceFiscale();
         int idVaccinazione=cittadino.getIdVaccinazione();
         String mail=cittadino.getMail();
         String username=cittadino.getUsername();
         String password=cittadino.getPassword();


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
