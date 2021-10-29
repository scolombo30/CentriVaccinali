//Davide Franco "741453" CO
//Sebastian Colombo "742779" CO
package cittadini;

public class DataLab {
    private static final long serialVersionUID = 1L;

private String giorno;
private String mese;
private  String anno;

    @Override
    public String toString() {
        return "Data:" +
                "giorno='" + giorno + '\'' +
                ", mese='" + mese + '\'' +
                ", anno='" + anno + '\'';
    }

    public DataLab(String giorno, String mese, String anno) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }

    public String getGiorno() {
        return giorno;
    }

    public void setGiorno(String giorno) {
        this.giorno = giorno;
    }

    public String getMese() {
        return mese;
    }

    public void setMese(String mese) {
        this.mese = mese;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }






}
