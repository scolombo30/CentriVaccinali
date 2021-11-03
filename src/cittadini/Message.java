//Davide Franco "741453" CO
//Sebastian Colombo "742779" CO
package cittadini;

import javax.swing.*;
import java.awt.*;

public class Message extends Component {

    public Message() {
    }
    public void warningMessage(String mess, String titolo){
        JOptionPane.showMessageDialog(this,
                mess,
                titolo,
                JOptionPane.WARNING_MESSAGE);}

    public void informationMessage(String mess,String titolo){
        JOptionPane.showMessageDialog(this,
                mess,
                titolo,
                JOptionPane.INFORMATION_MESSAGE);}

    public void errorMessage(String mess,String titolo){
        JOptionPane.showMessageDialog(this,
                mess,
                titolo,
                JOptionPane.ERROR_MESSAGE);}
}


