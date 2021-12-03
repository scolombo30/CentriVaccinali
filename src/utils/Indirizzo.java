//Davide Franco "741453" CO
//Sebastian Colombo "742779" CO

package utils;
import java.io.Serializable;

public class Indirizzo implements Serializable{


    //serialVersionUID per implementare serializable
    private static final long serialVersionUID = 1L;

    //campi
    private String qualificatore;
    private String nome;
    private String numeroCivico;
    private String comune;
    private String siglaProvincia;
    private String CAP;

    //costruttore
    /**
     * @param qualificatore
     * @param nome
     * @param numeroCivico
     * @param comune
     * @param siglaProvincia
     * @param cAP
     */
    public Indirizzo(String qualificatore, String nome, String numeroCivico, String comune, String siglaProvincia,
                     String cAP) {

        this.qualificatore = qualificatore;
        this.nome = nome.toLowerCase();
                //controllo se ci sono lettere nel numero civico e le rendo maiuscole nel caso
                int i=0; char c; String numero="";
                while(true){
                    try {
                        c = numeroCivico.charAt(i++);
                        if (Character.isLetter(c)) {numero=numero+String.valueOf(c).toUpperCase();
                }
                else numero=numero+c;
                        }catch (IndexOutOfBoundsException e){break;}
        }
        this.numeroCivico = numero;
        this.comune = comune.toLowerCase();
        this.siglaProvincia = siglaProvincia.toUpperCase();
        CAP = cAP;
    }

    //metodi
    /**
     * @return the qualificatore
     */
    public String getQualificatore() {
        return qualificatore;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @return the numeroCivico
     */
    public String getNumeroCivico() {
        return numeroCivico;
    }
    /**
     * @return the comune
     */
    public String getComune() {
        return comune;
    }
    /**
     * @return the siglaProvincia
     */
    public String getSiglaProvincia() {
        return siglaProvincia;
    }
    /**
     * @return the cAP
     */
    public String getCAP() {
        return CAP;
    }
    /**
     * @param qualificatore the qualificatore to set
     */
    public void setQualificatore(String qualificatore) {
        this.qualificatore = qualificatore;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @param numeroCivico the numeroCivico to set
     */
    public void setNumeroCivico(String numeroCivico) {
        this.numeroCivico = numeroCivico;
    }
    /**
     * @param comune the comune to set
     */
    public void setComune(String comune) {
        this.comune = comune;
    }
    /**
     * @param siglaProvincia the siglaProvincia to set
     */
    public void setSiglaProvincia(String siglaProvincia) {
        this.siglaProvincia = siglaProvincia;
    }
    /**
     * @param cAP the cAP to set
     */
    public void setCAP(String cAP) {
        CAP = cAP;
    }

    /**
     * @param obj indirizzo da confrontare
     */
    public boolean equals(Object obj) {
        Indirizzo altro=(Indirizzo) obj;
        if(this.qualificatore.equals(altro.qualificatore)&&
                this.nome.equals(altro.nome)&&
                this.numeroCivico.equals(altro.numeroCivico)&&
                this.comune.equals(altro.comune)&&
                this.siglaProvincia.equals(altro.siglaProvincia)&&
                this.CAP.equals(altro.CAP)) return true;
        else return false;
    }
    /**
     * @return Una stringa con tutte le informazioni dell'indirizzo
     */
    public String toString() {
        return this.qualificatore+ " "+
                this.nome+" "+
                this.numeroCivico +", "+
                this.comune+ "("+this.siglaProvincia+"), "+
                this.CAP;
    }
    /*
        /**
         * @return Una stringa con la prima lettera in maiuscolo e le altre in minuscolo

    private String primaLetteraMaiuscola(String str){
        String risultato="";
        //rendo la prima lettera maiuscola
        String prima_lettera = str.substring(0, 1);
        prima_lettera=prima_lettera.toUpperCase();
        //prendo le altre lettere
        String altre_lettere_nome = str.substring(1).toLowerCase();
        //riunisco il tutto
        risultato = prima_lettera + altre_lettere_nome;
        return risultato;}*/
    }


