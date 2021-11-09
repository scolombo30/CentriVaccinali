package utils;

import centrivaccinali.CentroVaccinale;
import cittadini.Cittadino;
import cittadini.EventoAvverso;
import cittadini.Vaccinato;

import java.sql.Connection;

public  class Registrazione {

    public Registrazione() {}
    //metodo registra centro vaccinale sul db
    public static void registraCentroVaccinale(Connection conn, CentroVaccinale centro){
        //tab CentriVaccinali
        }
    //metodo registra vaccianto su db
    public static void registraVaccinato(Connection conn, Vaccinato vaccinato) {
        //tab Vaccinati_NomeCentroVaccinale
        }
    //metodo registra cittadino su db
    public static void registraCittadino(Connection conn, Cittadino cittadino ){
        //tab Cittadini_Registrati
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
