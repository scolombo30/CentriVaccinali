//Davide Franco "741453" CO
//Sebastian Colombo "742779" CO
package centrivaccinali;

import utils.Indirizzo;
import java.io.Serializable;

public class CentroVaccinale implements Serializable{

    //serialVersionUID per implementare serializable
    private static final long serialVersionUID = 1L;

    //campi
    private String nome;
    private Indirizzo indirizzo;
    private String tipologia;

    //costruttore
    /**
     * @param nome
     * @param indirizzo
     * @param tipologia
     */
    public CentroVaccinale(String nome, Indirizzo indirizzo, String tipologia) {
        super();
        //controllare hce il nome sia senza spazi "_"
        this.nome = nome.toLowerCase();
        this.indirizzo = indirizzo;
        this.tipologia = tipologia.toLowerCase();
    }

    //metodi
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @return the indirizzo
     */
    public Indirizzo getIndirizzo() {
        return indirizzo;
    }
    /**
     * @return the tipologia
     */
    public String getTipologia() {
        return tipologia;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {

        //controllare che il nome sia senza spazi solo "_"
        this.nome = nome;
    }
    /**
     * @param indirizzo the indirizzo to set
     */
    public void setIndirizzo(Indirizzo indirizzo) {
        this.indirizzo = indirizzo;
    }
    /**
     * @param tipologia the tipologia to set
     */
    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }
    /**
     * @return Una stringa con tutte le informazioni del centro vaccinale
     */
    public String toString() {
        return "CentroVaccinale: " + nome + ", " + indirizzo + ", tipologia: " + tipologia;
    }
    /**
     * @param obj centro vaccinale da confrontare
     */
    public boolean equals(Object obj) {
        CentroVaccinale altro=(CentroVaccinale) obj;
        if(this.nome.equals(altro.nome)&&
                this.indirizzo.equals(altro.indirizzo)&&
                this.tipologia.equals(altro.tipologia)) return true;
        else return false;
    }
}
