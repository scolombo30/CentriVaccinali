package centrivaccinali;

import utils.Message;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreaDB {
    //variabili per la connessione
    static final String DB_URL= "jdbc:postgresql://localhost/";
    static final String USER = "postgres";
    static final String PASSWORD = "qwerty";
    private static JFrame a;


    public static void main(String[] args) {
        //creo JFrame invisibile per mostrare il JOptionPane con messaggio in caso di successo o insuccesso
        a=new JFrame();
        a.setVisible(false);
        //apro connessione
        try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
            Statement st= conn.createStatement();){
            String sql= "CREATE DATABASE Ma_funziona";
            st.executeUpdate(sql);
            Message.informationMessage(a,"Il database è stato creato con successo","Database creato");
            a.dispose();
            }catch (SQLException e){
            //ottengo il messaggio dell'errore e controllo se è quello del db che esiste già
            String errore = e.getMessage();
            if(errore.contains("database")&&errore.contains("already")&&errore.contains("exists")) {
                //avviso che esiste già il db
                Message.errorMessage(a,"Il database esiste di già","Database già creato");
                a.dispose();
            }
            else {
                //avviso dell'errore in generale
                Message.errorMessage(a,"Non sono riuscito a creare il database","Errore");
                a.dispose();
            }
        }
    }
}
