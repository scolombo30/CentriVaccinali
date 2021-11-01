//Davide Franco "741453" CO
//Sebastian Colombo "742779" CO
package cittadini;

import java.io.Serializable;
import java.util.Date;


public class Vaccinato implements Serializable{

    //serialVersionUID per implementare serializable
    private static final long serialVersionUID = 2L;

    //campi
    private String centroVaccinale;
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private DataLab dataSomministrazione;
    private String vaccino;
    private int idVaccinazione;

    //costruttore
    /**
     * @param centroVaccinale
     * @param nome
     * @param cognome
     * @param codiceFiscale
     * @param dataSomministrazione
     * @param vaccino
     * @param idVaccinazione
     */
    public Vaccinato(String nome, String cognome, String codiceFiscale,String centroVaccinale,
                     DataLab dataSomministrazione, String vaccino, int idVaccinazione) {
        super();
        this.centroVaccinale = primaLetteraMaiuscola(centroVaccinale);
        this.nome = primaLetteraMaiuscola(nome);
        this.cognome = primaLetteraMaiuscola(cognome);
        this.codiceFiscale = codiceFiscale.toUpperCase();
        this.dataSomministrazione = dataSomministrazione;
        this.vaccino = vaccino;
        this.idVaccinazione = idVaccinazione;
    }

    //metodi
    /**
     * @return the centroVaccinale
     */
    public String getCentroVaccinale() {
        return centroVaccinale;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @return the cognome
     */
    public String getCognome() {
        return cognome;
    }
    /**
     * @return the codiceFiscale
     */
    public String getCodiceFiscale() {
        return codiceFiscale;
    }
    /**
     * @return the dataSomministrazione
     */
    public DataLab getDataSomministrazione() {
        return dataSomministrazione;
    }
    /**
     * @return the vaccino
     */
    public String getVaccino() {
        return vaccino;
    }
    /**
     * @return the idVaccinazione
     */
    public int getIdVaccinazione() {
        return idVaccinazione;
    }
    /**
     * @param centroVaccinale the centroVaccinale to set
     */
    public void setCentroVaccinale(String centroVaccinale) {
        this.centroVaccinale = centroVaccinale;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @param cognome the cognome to set
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    /**
     * @param codiceFiscale the codiceFiscale to set
     */
    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }
    /**
     * @param dataSomministrazione the dataSomministrazione to set
     */
    public void setDataSomministrazione(DataLab dataSomministrazione) {
        this.dataSomministrazione = dataSomministrazione;
    }
    /**
     * @param vaccino the vaccino to set
     */
    public void setVaccino(String vaccino) {
        this.vaccino = vaccino;
    }
    /**
     * @param idVaccinazione the idVaccinazione to set
     */
    public void setIdVaccinazione(int idVaccinazione) {
        this.idVaccinazione = idVaccinazione;
    }

    /**
     * @param obj vaccinato da confrontare
     */
    public boolean equals(Object obj) {
        Vaccinato altro=(Vaccinato) obj;
        if(this.nome.equals(altro.nome)&&
                this.cognome.equals(altro.cognome)&&
                this.codiceFiscale.equals(altro.codiceFiscale)&&
                this.centroVaccinale.equals(altro.centroVaccinale)&&
                this.vaccino.equals(altro.vaccino)&&
                this.dataSomministrazione.equals(altro.dataSomministrazione)&&
                this.idVaccinazione==altro.idVaccinazione
        )return true;
        else return false;
    }

    /**
     * @return Una stringa con tutte le informazioni del vaccinato
     */
    public String toString() {
        return this.nome+" "+this.cognome+ ", "+this.codiceFiscale+
                "\nVaccinato presso: "+this.centroVaccinale+" con "+this.vaccino+" il "+this.dataSomministrazione +
                "\nID_vacinazione: "+this.idVaccinazione;
    }

    /**
     * @return Una stringa con la prima lettera in maiuscolo e le altre in minuscolo
     */
    private String primaLetteraMaiuscola(String str){
        String risultato="";
        //rendo la prima lettera maiuscola
        String prima_lettera = str.substring(0, 1);
        prima_lettera=prima_lettera.toUpperCase();
        //prendo le altre lettere
        String altre_lettere_nome = str.substring(1).toLowerCase();
        //riunisco il tutto
        risultato = prima_lettera + altre_lettere_nome;
        return risultato;
    }
}

