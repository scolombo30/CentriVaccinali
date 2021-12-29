//Davide Franco "741453" CO
// Sebastian Colombo "742779" CO
package cittadini;

import java.io.Serializable;

public class User implements Serializable {

    //serialVersionUID per implementare serializable
    private static final long serialVersionUID = 2L;
    //campi
    private String username;
    private String password;

    /**
     * @param username
     * @param password
     */
    public User(String username, String password) {
        this.username = username.toLowerCase();
        this.password = password;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }
    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @param o
     * @return if the user is equal to another user
     */
    @Override
    public boolean equals(Object o) {
        User altro=(User) o;
        if(altro.getUsername().equals(this.username)&&altro.getPassword().equals(this.password)){return true;}
        else{return false;}
    }
}
