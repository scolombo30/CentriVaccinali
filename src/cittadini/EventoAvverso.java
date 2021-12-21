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

    //costruttore
    public EventoAvverso (String tipologia, short gravità,String note, User user, String centro, String comune){
        this.tipologia = tipologia;
        this.gravità = gravità;
        this.note = note;
        this.user = user;
        this.centro=centro;
        this.comune = comune;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
//metodi

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public short getGravità() {
        return gravità;
    }

    public void setGravità(short gravità) {
        this.gravità = gravità;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getComune() {
        return  comune;
    }
    public String getCentro(){
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public void setComune(String comune) {
        this.comune = comune;
    }
}
