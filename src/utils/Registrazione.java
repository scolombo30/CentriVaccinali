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
import java.util.LinkedList;

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
            String query_crea_centri=SqlString.creaTabellaCentro();
            //update per la tabella
            st.executeUpdate(query_crea_centri);
            //creo query di inserimento dati in CentriVaccinali
            String query_inserisci_centro = SqlString.insertCentro(nome, tipologia, qualificatore, nomeVia, numeroCivico, comune, siglaProvincia, cap);
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
    public static int registraVaccinato(Connection conn, Vaccinato vaccinato) {
        //campi da inserire nella tabella
        //visto che il nome del centro diventa anche nome della tabella non può avere spazi, li sostituisco con "_"
        String centroVacci= (vaccinato.getCentroVaccinale().replaceAll("\\s","_")).replaceAll("''","_");
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
            String query_crea_vaccinato=SqlString.creaTabellaVaccinato(nomeTabella);
            //update per la tabella
            st.executeUpdate(query_crea_vaccinato);
            //creo query di inserimento dati nella tabella appena creata
            String query_insert_vaccinato=SqlString.insertVaccinato(nomeTabella,nome,cognome,cod_fisc,tipo_vaccino,id_vaccinazione,comune_centro,nomecentro,data_query);
            st.executeUpdate(query_insert_vaccinato);
            //se non ci sono stati errori ritorno vero
            return 0;

        } catch (SQLException e) {

            String errore=e.getMessage();
            //se esiste già un id vax con lo stesso valore return 1
            if(errore.contains("Key (id_vax)")){return 1;}
            //se esiste già un codice fiscale  con lo stesso valore return 2
            else if(errore.contains("Key (codice_fiscale)")){return 2;}
            //per altri errori return 3
            else return 3;
        }
    }
    //metodo registra cittadino su db
    public static int registraCittadino(Connection conn, Cittadino cittadino){
         //tab Cittadini_Registrati
         String nome=cittadino.getNome();
         String cognome= cittadino.getCognome();
         String codiceFiscale=cittadino.getCodiceFiscale();
         long idVaccinazione=cittadino.getIdVaccinazione();
         String username=cittadino.getUser().getUsername();
         String password=cittadino.getUser().getPassword();
         try{
             //creo lo statement
             Statement st= conn.createStatement();
             //creo query di creazione tabella users se non è già presente nel DB
             String query_crea_user=SqlString.creaTabellaUser();
             //update per la tabella
             st.executeUpdate(query_crea_user);
             //inserisco dati in users
             String query_inserisci_user=SqlString.insertUsers(username,password);
             st.executeUpdate(query_inserisci_user);
             //creo query di creazione tabella cittadini se non è già presente nel DB
             String query_crea_cittadino=SqlString.creaTabellaCittadino();
             st.executeUpdate(query_crea_cittadino);
             //creo query di inserimento dati in cittadino
             String query_inserisci_cittadino =SqlString.insertCittadino(idVaccinazione,nome,cognome,codiceFiscale,username,password);
             st.executeUpdate(query_inserisci_cittadino);


             //se non ci sono stati errori ritorno vero
             return 0;
         } catch (SQLException e) {
             String errore=e.getMessage();

             if(errore.contains("Key (username)")){return 1;}
             else if(errore.contains("Key (codice_fiscale)")){return 2;}
             //se esiste già un id vax con lo stesso valore return 3
             else if(errore.contains("Key (id_vax)")){return 3;}
             else return 4;
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
            String query_ricerca=SqlString.selectLogin(user,psw);
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
    public static LinkedList<CentroVaccinale> cercaCentroVaccinaleNome(Connection conn,String nome){
        try {
            //creo lo statement
            Statement st = conn.createStatement();
            //creo query di select cittadino con queste credenziali
            String query_nome_centro=SqlString.selectCentroNome(nome);
            //update per la tabella
            ResultSet rs = st.executeQuery(query_nome_centro);
            LinkedList<CentroVaccinale> listaCentri=new LinkedList<CentroVaccinale>();
            CentroVaccinale centrotmp;Indirizzo indirizzotmp;
            String nome_centro;String qualificatore; String nome_via; String numciv;String comune; String siglaProvincia; String cap; String tipologia;
            while(rs.next()){
                //ottengo tutti i campi dal resulSet
                nome_centro=rs.getString("Nome_Centro");
                qualificatore=rs.getString("Qualificatore");
                nome_via=rs.getString("Nome_via");
                numciv=rs.getString("Numero_civico");
                comune=rs.getString("Comune");
                siglaProvincia=rs.getString("Provincia");
                cap=rs.getString("Cap");
                tipologia=rs.getString("Tipologia");
                //creo l'indirizzo e il centro che andrò ad aggiugere alla linkedList<>
                indirizzotmp=new Indirizzo(qualificatore,nome_via,numciv,comune,siglaProvincia,cap);
                centrotmp=new CentroVaccinale(nome_centro,indirizzotmp,tipologia);
                listaCentri.add(centrotmp);
                }
                return listaCentri;
        }catch(SQLException e) {
            return null;
        }
    }
    //metodo cerca centro vaccinale x comune, tipologia
    public static  LinkedList<CentroVaccinale> cercaCentroVaccinaleCoTip(Connection conn,String com, String tip){
        try {
            //creo lo statement
            Statement st = conn.createStatement();
            //creo query di select cittadino con queste credenziali
            String query_nome_centro=SqlString.selectCentroComuneTipolgia(com,tip);
            //update per la tabella
            ResultSet rs = st.executeQuery(query_nome_centro);
            LinkedList<CentroVaccinale> listaCentri=new LinkedList<CentroVaccinale>();
            CentroVaccinale centrotmp;Indirizzo indirizzotmp;
            String nome_centro;String qualificatore; String nome_via; String numciv;String comune; String siglaProvincia; String cap; String tipologia;
            while(rs.next()){
                //ottengo tutti i campi dal resulSet
                nome_centro=rs.getString("Nome_Centro");
                qualificatore=rs.getString("Qualificatore");
                nome_via=rs.getString("Nome_via");
                numciv=rs.getString("Numero_civico");
                comune=rs.getString("Comune");
                siglaProvincia=rs.getString("Provincia");
                cap=rs.getString("Cap");
                tipologia=rs.getString("Tipologia");
                //creo l'indirizzo e il centro che andrò ad aggiugere alla linkedList<>
                indirizzotmp=new Indirizzo(qualificatore,nome_via,numciv,comune,siglaProvincia,cap);
                centrotmp=new CentroVaccinale(nome_centro,indirizzotmp,tipologia);
                listaCentri.add(centrotmp);
            }
            return listaCentri;

        }catch(SQLException e) {
            return null;
        }

    }
    //metodo inserisci evento avverso
    public static boolean inserisciEventiAvversi(Connection conn, EventoAvverso evento){
        //tab variabili utili
        String tipologia=evento.getTipologia();
        String note=evento.getNote();
        short gravità= evento.getGravità();
        String username= evento.getUser().getUsername();
        String comune=evento.getComune();
        String nome_centro=evento.getCentro();

    try{
        //creo lo statement
        Statement st= conn.createStatement();
        //creo query di creazione tabella se non è già presente nel DB
        String query_crea_evento=SqlString.creaTabellaEvento();
        //update per tabella
        st.executeUpdate(query_crea_evento);
        //creo query di inserimento dati in eventi_avversi
        String query_inserisci_evento = SqlString.insertEvento(tipologia,gravità,note,username,comune,nome_centro);
        st.executeUpdate(query_inserisci_evento);
        //se non ci sono errori ritorno vero
        return true;
    }catch(SQLException e){
        e.printStackTrace();
        return false;
    }
    }
    //metodo visualizza info
    public static String [][] infoEventiAvversi(Connection conn,String centro, String comune){
        try{
            String[][] info = new String[][]{{"Mal di testa","0","0"},
                                             {"Febbre","0","0"},
                                             {"Dolori muscolari e articolari","0","0"},
                                             {"Linfoadenopatia","0","0"},
                                             {"Tachicardia","0","0"},
                                             {"Crisi ipertensiva","0","0"}};

        //creo lo statement
        Statement st = conn.createStatement();
        //creo query di select cittadino con queste credenziali
            for (int i = 0; i <6;i++){
                String query_info_eventi=SqlString.selectEventoAvverso(centro,comune,info[i][0]);
                //update per la tabella
                ResultSet rs = st.executeQuery(query_info_eventi);
                while(rs.next()){
                    //ottengo tutti i campi dal resulSet
                    info[i][1]=rs.getString("occorrenze");
                    //controllo se media == null
                    info[i][2]=rs.getString("media");
                    if(info[i][2]==null) {
                        info[i][2] = "0";
                    }


                }
            }
        return info;
    }catch(SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
