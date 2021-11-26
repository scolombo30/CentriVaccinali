//Davide Franco "741453" CO
// Sebastian Colombo "742779" CO
package cittadini;
import java.io.Serializable;

public class User implements Serializable {

    //serialVersionUID per implementare serializable
    private static final long serialVersionUID = 1L;

    //campi
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        User altro=(User) o;
        if(altro.getUsername().equals(this.username)&&altro.getPassword().equals(this.password)){return true;}
        else{return false;}
    }
}
