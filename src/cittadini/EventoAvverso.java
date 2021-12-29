//Davide Franco "741453" CO
// Sebastian Colombo "742779" CO
package cittadini;

import java.io.Serializable;


public class EventoAvverso implements Serializable {

    //serialVersionUID per implementare serializable
    private static final long serialVersionUID = 2L;
    //campi
    private String tipologia;
    private short gravità;
    private String note;
    private User user;
    private String centro;
    private String comune;
    /**
     * @param tipologia
     * @param gravità
     * @param note
     * @param user
     * @param centro
     * @param comune
     */
    //costruttore
    public EventoAvverso (String tipologia, short gravità,String note, User user, String centro, String comune){
        this.tipologia = tipologia;
        this.gravità = gravità;
        this.note = note;
        this.user = user;
        this.centro=centro;
        this.comune = comune;
    }

    //metodi
    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }
    /**
     * @return the tipologia
     */
    public String getTipologia() {
        return tipologia;
    }
    /**
     * @return the gravità
     */
    public short getGravità() {
        return gravità;
    }
    /**
     * @return the note
     */
    public String getNote() {
        return note;
    }
    /**
     * @return the comune
     */
    public String getComune() {
        return  comune;
    }
    /**
     * @return the centro
     */
    public String getCentro(){
        return centro;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @param tipologia the tipologia to set
     */
    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }
    /**
     * @param gravità the griavità to set
     */
    public void setGravità(short gravità) {
        this.gravità = gravità;
    }
    /**
     * @param note the note to set
     */
    public void setNote(String note) {
        this.note = note;
    }
    /**
     * @param centro the centro to set
     */
    public void setCentro(String centro) {
        this.centro = centro;
    }
    /**
     * @param  comune the comune to set
     */
    public void setComune(String comune) {
        this.comune = comune;
    }
}
