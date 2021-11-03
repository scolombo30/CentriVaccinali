//Davide Franco "741453" CO
//Sebastian Colombo "742779" CO
package utils;

import javax.swing.*;
import java.awt.*;

public class Message {

    public Message() {
    }

    public static void warningMessage(Component c,String mess, String titolo){
        JOptionPane.showMessageDialog(c,
                mess,
                titolo,
                JOptionPane.WARNING_MESSAGE);}

    public static void informationMessage(Component c,String mess,String titolo){
        JOptionPane.showMessageDialog(c,
                mess,
                titolo,
                JOptionPane.INFORMATION_MESSAGE);}

    public static void errorMessage(Component c,String mess,String titolo){
        JOptionPane.showMessageDialog(c,
                mess,
                titolo,
                JOptionPane.ERROR_MESSAGE);}
}


