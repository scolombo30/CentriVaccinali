//Davide Franco "741453" CO
//Sebastian Colombo "742779" CO
package utils;
import java.io.Serializable;

public class DataLab implements Serializable {
    private static final long serialVersionUID = 1L;
    private String giorno;
    private String mese;
    private String anno;

//costruttore
    /**
     * @param giorno
     * @param mese
     * @param anno
     */
    public DataLab(String giorno, String mese, String anno) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }
    /**
     * @return Una stringa con tutte le informazioni della data
     */
    @Override
    public String toString() {
        return "Data: " + giorno+ "/" +mese+ "/" + anno ;
                }

    /**
     * @return the giorno
     */
    public String getGiorno() {
        return giorno;
    }
    /**
     * @param giorno the giorno to set
     */
    public void setGiorno(String giorno) {
        this.giorno = giorno;
    }
    /**
     * @return the mese
     */
    public String getMese() {
        return mese;
        }

    /**
     * @param mese the mese to set
     */
    public void setMese(String mese) {
        this.mese = mese;
    }
    /**
     * @return the anno
     */
    public String getAnno() {
        return anno;
    }
    /**
     * @param anno the anno to set
     */
    public void setAnno(String anno) {
        this.anno = anno;
    }






}
