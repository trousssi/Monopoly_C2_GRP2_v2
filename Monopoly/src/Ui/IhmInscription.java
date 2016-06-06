/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author fallm
 */
public class IhmInscription extends JFrame {
    
    
    public IhmInscription() {
        super();

        initUIComponents();
    }
    
    private void initUIComponents() {
        this.setLayout((new BorderLayout()));
        JPanel gererLesJoueurs
        JPanel  
        JPanel choix
        this.setLayout(new GridLayout(6,2));
        
        for (int i = 1; i<7 ; i++){
            JLabel l = new JLabel("Joueur " + i + " : ");   this.add(l);
            JTextField text = new JTextField();             this.add(text);
        }
        
    }   
    
    /**
     * Rend visible la fenetre
     */
    public void afficher() {
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setVisible(true);                        
    }
    

    /*public void displayInscription() {

    }*/

    public void majInscriptionDepuisIhm() {

    }

}
