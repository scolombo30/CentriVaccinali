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
    private long idVaccinazione;
    private User user;

    /**
     * @param nome
     * @param cognome
     * @param codiceFiscale
     * @param idVaccinazione
     * @param user
     */
    public Cittadino(String nome, String cognome, String codiceFiscale, long idVaccinazione, User user) {
        super();
        this.nome = nome.toLowerCase();
        this.cognome = cognome.toLowerCase();
        this.codiceFiscale = codiceFiscale.toUpperCase();
        this.idVaccinazione = idVaccinazione;
        this.user=user;
    }

    //metodi
    /**
     * @return the nome
     */
    public User getUser() {
        return user;
    }
    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
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
     * @return the idVaccinazione
     */
    public long getIdVaccinazione() {
        return idVaccinazione;
    }
    /**
     * * @param nome the nome to set
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
    public void setIdVaccinazione(long idVaccinazione) {
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
}
