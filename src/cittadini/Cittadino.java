//Davide Franco "741453" CO
//Sebastian Colombo "742779" CO

package cittadini;

import java.io.Serializable;

public class Cittadino implements Serializable{

    //serialVersionUID per implementare serializable
    private static final long serialVersionUID = 1L;

    //campi
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private int idVaccinazione;
    private User user;


    //costruttore
    /**
     * @param nome
     * @param cognome
     * @param codiceFiscale
     * @param idVaccinazione
     * @param user
     */
    public Cittadino(String nome, String cognome, String codiceFiscale, int idVaccinazione, User user) {
        super();
        this.nome = primaLetteraMaiuscola(nome);
        this.cognome = primaLetteraMaiuscola(cognome);
        this.codiceFiscale = codiceFiscale.toUpperCase();
        this.idVaccinazione = idVaccinazione;
        this.user=user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
//metodi
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
     * @return the idVaccinazione
     */
    public int getIdVaccinazione() {
        return idVaccinazione;
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
     * @param idVaccinazione the idVaccinazione to set
     */
    public void setIdVaccinazione(int idVaccinazione) {
        this.idVaccinazione = idVaccinazione;
    }

    /**
     * @param obj cittadino da confrontare
     */
    public boolean equals(Object obj) {
        Cittadino altro=(Cittadino) obj;
        if(this.nome.equals(altro.nome)&&
                this.cognome.equals(altro.cognome)&&
                this.codiceFiscale.equals(altro.codiceFiscale)&&
                this.user.equals(altro.getUser())&&
                this.idVaccinazione==altro.idVaccinazione
        )return true;
        else return false;
    }

    /**
     * @return Una stringa con tutte le informazioni del cittadino
     */
   /* public String toString() {
        return this.nome+" "+this.cognome+", "+this.codiceFiscale+
                "\nUsername: "+this.username+", Mail: "+this.mail+", Psw: "+this.password +
                "\nID_Vaccinazione: "+this.idVaccinazione;
    }

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
