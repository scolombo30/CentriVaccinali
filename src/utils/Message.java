//Davide Franco "741453" CO
//Sebastian Colombo "742779" CO
package utils;

import javax.swing.*;
import java.awt.*;

public class Message {
    /**
     * @param c set the componet
     * @param mess set the warning message
     * @param titolo set the title of the message
     */
    //metodo per messaggi di warnig
    public static void warningMessage(Component c,String mess, String titolo){
        JOptionPane.showMessageDialog(c,
                mess,
                titolo,
                JOptionPane.WARNING_MESSAGE);}
    /**
     * @param c set the componet
     * @param mess set the information message
     * @param titolo set the title of the message
     */
    //metodo per messaggi di information
    public static void informationMessage(Component c,String mess,String titolo){
        JOptionPane.showMessageDialog(c,
                mess,
                titolo,
                JOptionPane.INFORMATION_MESSAGE);}
    /**
     * @param c set the componet
     * @param mess set the error message
     * @param titolo set the title of the message
     */
    //metodo per messaggi di errore
    public static void errorMessage(Component c,String mess,String titolo){
        JOptionPane.showMessageDialog(c,
                mess,
                titolo,
                JOptionPane.ERROR_MESSAGE);}
    /**
     * @param c set the componet
     * @param mess set the confirm message
     * @param titolo set the title of the message
     */
    //metodi per conferma
    public static int confirmMessage(Component c,String mess,String titolo){
        Object[] options = {"Si", "No"};
        return JOptionPane.showOptionDialog(
                c,
                mess,
                titolo,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
    }
}


