/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import javax.swing.JOptionPane;

/**
 *
 * @author vivierlo
 */
public class IhmBoiteMessage {
    
    public static boolean afficherBoiteDialogue(String message, String mode) {
        int response = 0;
        switch(mode) {
            case "info": JOptionPane.showConfirmDialog(null, message, "Information", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
                response = 1; break;
            case "ouinon": JOptionPane.showConfirmDialog(null, message, "Veuillez confirmer l'opération", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                response = JOptionPane.YES_OPTION; break;
                
        }
        return response == JOptionPane.YES_OPTION;
    }
    
}
