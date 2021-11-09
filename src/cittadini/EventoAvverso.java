package cittadini;

import centrivaccinali.CentroVaccinale;

import java.io.Serializable;

public class EventoAvverso implements Serializable {

    //serialVersionUID per implementare serializable
    private static final long serialVersionUID = 2L;
    //campi
    private Cittadino user;
    private CentroVaccinale centro;
    private String tipologia;
    private short gravità;
    private String note;

    //costruttore
    public EventoAvverso (Cittadino user,CentroVaccinale centro,String tipologia, short gravità,String note){
        this.user = user;
        this.centro = centro;
        this.tipologia = tipologia;
        this.gravità = gravità;
        this.note = note;
    }

    //metodi
    public CentroVaccinale getCentro() {
        return centro;
    }

    public void setCentro(CentroVaccinale centro) {
        this.centro = centro;
    }

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
}
