//Davide Franco "741453" CO
// Sebastian Colombo "742779" CO
package utils;

public class SqlString {

    //String query CreaTabellaCentro
    static String creaTabellaCentro(){
       String query = "CREATE TABLE IF NOT EXISTS CentriVaccinali ("+
                "Nome_Centro VARCHAR(35),"+
                "Tipologia VARCHAR(11)," +
                "Qualificatore VARCHAR(7),"+
                "Nome_via VARCHAR(35),"+
                "Numero_civico VARCHAR(5),"+
                "Comune VARCHAR(35),"+
                "Provincia VARCHAR(2),"+
                "Cap VARCHAR(5),"+
                "PRIMARY KEY(Nome_Centro,Comune))";
       return query;

    }
    //String query CreaTabellaVaccinato
    public static String creaTabellaVaccinato(String nomeTabella) {
        String query="CREATE TABLE IF NOT EXISTS "+nomeTabella+"("+
                "Nome VARCHAR(20),"+
                "Cognome VARCHAR(20),"+
                "Codice_fiscale VARCHAR(16) UNIQUE,"+
                "Data DATE,"+
                "Tipologia_vaccino VARCHAR(10),"+
                "Id_vax NUMERIC(16) PRIMARY KEY,"+
                "Nome_centro VARCHAR(35),"+
                "Comune VARCHAR(35),"+
                "foreign key(Nome_Centro,Comune) references CentriVaccinali(Nome_Centro,Comune))";
        return query;
    }
    //String query CreaTabellaCittadino
    public static String creaTabellaCittadino() {
        String query="CREATE TABLE IF NOT EXISTS Cittadini_Registrati("+
                "Id_vax NUMERIC(16) UNIQUE,"+
                "Nome VARCHAR(20),"+
                "Cognome VARCHAR(20),"+
                "Codice_fiscale VARCHAR(16) UNIQUE,"+
                "Username VARCHAR(35) UNIQUE,"+
                "Password VARCHAR(35),"+
                "PRIMARY KEY(Id_vax),"+
                "foreign key (Username,Password) references Users (Username,Password))";

        return query;
    }
    //String query CreaTabellaUser
    public static String creaTabellaUser() {
        String query="CREATE TABLE IF NOT EXISTS Users("+
                "Username VARCHAR(35) UNIQUE,"+
                "Password VARCHAR(35),"+
                "PRIMARY KEY(Username,Password))";
        return query;
    }
    //String query CreaTabellaEvento
    public static String creaTabellaEvento() {
        String query = "CREATE TABLE IF NOT EXISTS Eventi_avversi (" +
                "Tipologia VARCHAR(30)," +
                "Severità NUMERIC(1)," +
                "Note VARCHAR(256)," +
                "Username VARCHAR(35))";
        return query;
    }
    //metodo insert centro
    public static String insertCentro(String nome,String tipologia,String qualificatore, String nomeVia, String numeroCivico, String comune, String siglaProvincia, String cap){
        String query= "INSERT INTO CentriVaccinali VALUES ('"+nome+"','"+tipologia+"','"+qualificatore+"','"+nomeVia+"','"
                +numeroCivico+"','"+comune+"','"+siglaProvincia+"','"+cap+"')";
        return query;
    }

    //metodo insert vaccinato
    public static String insertVaccinato(String nomeTabella, String nome, String cognome, String cod_fisc, String tipo_vaccino, long id_vaccinazione, String comune_centro, String nomecentro,  String data_query) {
        String query= "INSERT INTO "+nomeTabella+" VALUES ('"+nome+"', '"+cognome+"', '"+cod_fisc+"', " +
                "'" +data_query+"', '"+tipo_vaccino+"', '"+id_vaccinazione+"', '"+nomecentro+"','"+comune_centro+"')";
        return query;
    }
    //metodo insert users
    public static String insertUsers(String username, String password) {
        String query="INSERT INTO Users VALUES ('"+username+"', '"+password+"')";
        return query;
    }
    //metodo insert citadino
    public static String insertCittadino(long idVaccinazione, String nome, String cognome, String codiceFiscale,String username,String password) {
        String query="INSERT INTO Cittadini_Registrati VALUES ('"+idVaccinazione+"', '"+nome+"', '"+cognome+"', '"+codiceFiscale+"','"+username+"','"+password+"')";
        return query;
    }
    //metodo insert evento
    public static String insertEvento(String tipologia, short gravità, String note, String username) {
        String query="INSERT INTO Eventi_avversi VALUES ('"+tipologia+"', '"+gravità+"', '"+note+"', '"+username+"')";
        return query;
    }
    //metodo select login
    public static String selectLogin(String user,String psw) {
        String query="SELECT * FROM Users WHERE Username='"+user+"' AND Password='"+psw+"';";
        return query;
    }
}
