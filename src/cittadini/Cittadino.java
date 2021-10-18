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
    private String mail;
    private String username;
    private String password;

    //costruttore
    /**
     * @param nome
     * @param cognome
     * @param codiceFiscale
     * @param idVaccinazione
     * @param mail
     * @param username
     * @param password
     */
    public Cittadino(String nome, String cognome, String codiceFiscale, int idVaccinazione, String mail,
                     String username, String password) {
        super();
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.idVaccinazione = idVaccinazione;
        this.mail = mail;
        this.username = username;
        this.password = password;
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
     * @return the mail
     */
    public String getMail() {
        return mail;
    }
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }
    /**
     * @return the paasword
     */
    public String getPassword() {
        return password;
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
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }
    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * @param password the paasword to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param obj cittadino da confrontare
     */
    public boolean equals(Object obj) {
        Cittadino altro=(Cittadino) obj;
        if(this.nome.equals(altro.nome)&&
                this.cognome.equals(altro.cognome)&&
                this.codiceFiscale.equals(altro.codiceFiscale)&&
                this.mail.equals(altro.mail)&&
                this.password.equals(altro.password)&&
                this.username.equals(altro.username)&&
                this.idVaccinazione==altro.idVaccinazione
        )return true;
        else return false;
    }

    /**
     * @return Una stringa con tutte le informazioni del cittadino
     */
    public String toString() {
        return this.nome+" "+this.cognome+", "+this.codiceFiscale+
                "\nUsername: "+this.username+", Mail: "+this.mail+", Psw: "+this.password +
                "\nID_Vaccinazione: "+this.idVaccinazione;
    }
}
