//Davide Franco "741453" CO
// Sebastian Colombo "742779" CO
package utils;

public class SqlString {

    /**
     * @return the string that creates the database
     */
    //metodo creao Db
    public static String creaDB(){
    return "CREATE DATABASE PiattaformaCV";
    }
    /**
     * @return the string that creates the table Codice_operatore
     */
    //metodo creaTabellaCodiciOperatore
    public static String creaTabellaCodiciOperatore() {
        return "CREATE TABLE IF NOT EXISTS Codice_operatore(" +
                "Codice VARCHAR(20))";
    }
    /**
     * @return the string that creates the table CentriVaccinali
     */
    //String query CreaTabellaCentro
    public static String creaTabellaCentro(){
        return "CREATE TABLE IF NOT EXISTS CentriVaccinali ("+
                "Nome_Centro VARCHAR(35),"+
                "Tipologia VARCHAR(11)," +
                "Qualificatore VARCHAR(7),"+
                "Nome_via VARCHAR(35),"+
                "Numero_civico VARCHAR(5),"+
                "Comune VARCHAR(35),"+
                "Provincia VARCHAR(2),"+
                "Cap VARCHAR(5),"+
                "PRIMARY KEY(Nome_Centro,Comune))";
    }
    /**
     * @return the string that creates the table Vaccinati_nomecentrovaccinale
     */
    //String query CreaTabellaVaccinato
    public static String creaTabellaVaccinato(String nomeTabella) {
        return "CREATE TABLE IF NOT EXISTS "+nomeTabella+"("+
                "Nome VARCHAR(20),"+
                "Cognome VARCHAR(20),"+
                "Codice_fiscale VARCHAR(16) UNIQUE,"+
                "Data DATE,"+
                "Tipologia_vaccino VARCHAR(10),"+
                "Id_vax NUMERIC(16) PRIMARY KEY,"+
                "Nome_centro VARCHAR(35),"+
                "Comune VARCHAR(35),"+
                "foreign key(Nome_Centro,Comune) references CentriVaccinali(Nome_Centro,Comune))";
    }
    /**
     * @return the string that creates the table Cittadini_Registrati
     */
    //String query CreaTabellaCittadino
    public static String creaTabellaCittadino() {
        return"CREATE TABLE IF NOT EXISTS Cittadini_Registrati("+
                "Id_vax NUMERIC(16) UNIQUE,"+
                "Nome VARCHAR(20),"+
                "Cognome VARCHAR(20),"+
                "Codice_fiscale VARCHAR(16) UNIQUE,"+
                "Username VARCHAR(35) UNIQUE,"+
                "Password VARCHAR(35),"+
                "PRIMARY KEY(Id_vax),"+
                "foreign key (Username,Password) references Users (Username,Password))";
    }
    /**
     * @return the string that creates the table users
     */
    //String query CreaTabellaUser
    public static String creaTabellaUser() {
        return "CREATE TABLE IF NOT EXISTS Users("+
                "Username VARCHAR(35) UNIQUE,"+
                "Password VARCHAR(35),"+
                "PRIMARY KEY(Username,Password))";
    }
    /**
     * @return the string that creates the table Eventi_avversi
     */
    //String query CreaTabellaEvento
    public static String creaTabellaEvento() {
        return "CREATE TABLE IF NOT EXISTS Eventi_avversi (" +
                "Tipologia VARCHAR(30)," +
                "Severità NUMERIC(1)," +
                "Note VARCHAR(256)," +
                "Centro VARCHAR(35),"+
                "Comune_centro VARCHAR(35),"+
                "Username VARCHAR(35)," +
                "foreign key (Username) references Users (Username)," +
                "foreign key (Centro,Comune_centro) references CentriVaccinali (Nome_Centro,Comune))";
    }
    /**
     * @return the string that is used to insert value in  codice_operatore
     */
    //metodo insert cod. operatore
    public static String insertCodiceOperatore() {
        return "INSERT INTO codice_operatore VALUES ('12345')";
    }
    /**
     * @return the string that is used to insert value in  CentriVaccinali
     */
    //metodo insert centro
    public static String insertCentro(String nome,String tipologia,String qualificatore, String nomeVia, String numeroCivico, String comune, String siglaProvincia, String cap){
        return "INSERT INTO CentriVaccinali VALUES ('"+nome+"','"+tipologia+"','"+qualificatore+"','"+nomeVia+"','"
                +numeroCivico+"','"+comune+"','"+siglaProvincia+"','"+cap+"')";
    }
    /**
     * @return the string that is used to insert value in  Vaccinati_nomecentrovaccinale
     */
    //metodo insert vaccinato
    public static String insertVaccinato(String nomeTabella, String nome, String cognome, String cod_fisc, String tipo_vaccino, long id_vaccinazione, String comune_centro, String nomecentro,  String data_query) {
        return "INSERT INTO "+nomeTabella+" VALUES ('"+nome+"', '"+cognome+"', '"+cod_fisc+"', " +
                "'" +data_query+"', '"+tipo_vaccino+"', '"+id_vaccinazione+"', '"+nomecentro+"','"+comune_centro+"')";
    }
    /**
     * @return the string that is used to insert value in  Users
     */
    //metodo insert users
    public static String insertUsers(String username, String password) {
        return "INSERT INTO Users VALUES ('"+username+"', '"+password+"')";
    }
    /**
     * @return the string that is used to insert value in  Cittadini_Registrati
     */
    //metodo insert cittadino
    public static String insertCittadino(long idVaccinazione, String nome, String cognome, String codiceFiscale,String username,String password) {
        return"INSERT INTO Cittadini_Registrati VALUES ('"+idVaccinazione+"', '"+nome+"', '"+cognome+"', '"+codiceFiscale+"','"+username+"','"+password+"')";
    }
    /**
     * @return the string that is used to insert value in Eventi_avversi
     */
    //metodo insert evento
    public static String insertEvento(String tipologia, short gravità, String note, String username, String centro, String comune_centro) {
        return "INSERT INTO Eventi_avversi VALUES ('"+tipologia+"', '"+gravità+"', '"+note+"', '"+comune_centro+"','"+centro+"','"+username+"')";
    }
    /**
     * @return the string that is used to get values from Users
     */
    //metodo select login
    public static String selectLogin(String user,String psw) {
        return "SELECT * FROM Users " +
                "WHERE Username='"+user+"' AND Password='"+psw+"';";
    }
    /**
     * @return the string that is used to get values from CentriVaccinali
     */
    //metodo select cerca centro per nome
    public static String selectCentroNome(String nome){
        return "SELECT * FROM CentriVaccinali " +
                "WHERE Nome_Centro like '%"+nome+"%';";
    }
    /**
     * @return the string that is used to get values from CentriVaccinali
     */
    //metodo select cerca centro per comune e tipologia
    public static String selectCentroComuneTipolgia(String comune,String tipologia){
        return "SELECT * FROM CentriVaccinali " +
                "WHERE Comune like '%"+comune+"%' AND Tipologia='"+tipologia+"';";
    }
    /**
     * @return the string that is used to get values from Eventi_avversi
     */
    //metodo select avvento avverso
    public static String selectEventoAvverso(String centro, String comune, String evento){
        return "SELECT COUNT(*) as occorrenze, AVG(severità) as media FROM eventi_avversi " +
                "WHERE centro='"+centro+"' AND comune_centro='"+comune+"' AND tipologia='"+evento+"';";
    }
    /**
     * @return the string that is used to get values from codice_operatore
     */
    public static String selectCodiceOperatore() {
        return  "SELECT codice FROM codice_operatore;";

    }
    /**
     * @return the string that is used to get values from codice_operatore
     */
   //metodo update codiceOperatore
    public static String updateCodiceOperatore(String vecchio, String nuovo)    {
        return "UPDATE codice_operatore SET codice='"+nuovo+"' WHERE codice='"+vecchio+"'";
    }



}
