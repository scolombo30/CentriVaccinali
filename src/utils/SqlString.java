package utils;

import centrivaccinali.CentroVaccinale;

public class SqlString {

    //String query CreaTabellaCentro
    static String CreaTabellaCentro(){
       String query = "CREATE TABLE IF NOT EXISTS CentriVaccinali ("+
                "Nome_Centro VARCHAR(30) PRIMARY KEY,"+
                "Tipologia VARCHAR(11)," +
                "Qualificatore VARCHAR(7),"+
                "Nome_via VARCHAR(15),"+
                "Numero_civico VARCHAR(5),"+
                "Comune VARCHAR(15) PRIMARY KEY,"+
                "Provincia VARCHAR(2)"+
                "Cap VARCHAR(5))";
       return query;

    }
   /*//String query CreaTabellaIndirizzzo
    static String CreaTabellaIndirizzzo(){
        String query = "CREATE TABLE IF NOT EXISTS Indirizzi ("+
                "Centro VARCHAR(30) REFERENCES CentriVaccinali(Nome_Centro),"+
                "Qualificatore VARCHAR(7),"+
                "Nome_via VARCHAR(15),"+
                "Numero_civico VARCHAR(5),"+
                "Comune VARCHAR(15),"+
                "Provincia VARCHAR(2),"+
                "Cap VARCHAR(5),"+
                "PRIMARY KEY (Centro))";
        return query;
    }*/
    //String query CreaTabellaVaccinato
    public static String CreaTabellaVaccinato(String nomeTabella) {
        String query="CREATE TABLE IF NOT EXISTS "+nomeTabella+"("+
                "Nome VARCHAR(20),"+
                "Cognome VARCHAR(20),"+
                "Codice_fiscale VARCHAR(16),"+
                "Data DATE,"+
                "Tipologia_vaccino VARCHAR(10),"+
                "Id_vax NUMERIC(16) PRIMARY KEY,"+
                "Nome_centro VARCHAR(20),"+
                "Comune VARCHAR(20),"+
                "foreign key(Nome_centro,Comune) references CentriVaccianli(Nome_Centro,Comune))";
        return query;
    }
    //String query CreaTabellaCittadino
    public static String CreaTabellaCittadino() {
        String query="CREATE TABLE IF NOT EXISTS Cittadini_Registrati("+
                "Nome VARCHAR(20),"+
                "Cognome VARCHAR(20),"+
                "Codice_fiscale VARCHAR(16),"+
                "Username VARCHAR(20),"+
                "Password VARCHAR(20),"+
                "foreign key (Username,Password) references User(Username,Password),"+
                "Id_vax NUMERIC(16) PRIMARY KEY))";
        return query;
    }
    //String query CreaTabellaUser
    public static String CreaTabellaUser() {
        String query="CREATE TABLE IF NOT EXISTS User("+
                "Username VARCHAR(20),"+
                "Password VARCHAR(20),"+
                "PRIMARY KEY(Username,Password))";
        return query;
    }
    //String query CreaTabellaEvento
    public static String CreaTabellaEvento() {
        String query="CREATE TABLE IF NOT EXISTS Eventi_avversi (" +
                "Tipologia VARCHAR(30)," +
                "Severità NUMERIC(1)," +
                "Note VARCHAR(256))"+
                "Username VARCHAR(20),"+
                "Password VARCHAR(20),"+
                "foreign key (Username,Password) references User(Username,Password))";
                return query;
    }
}
