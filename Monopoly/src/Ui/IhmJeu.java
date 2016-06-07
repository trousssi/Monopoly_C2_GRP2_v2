/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author fallm
 */
public class IhmJeu extends JFrame{
    private IhmPlateau plateau; 
    
    
    public IhmJeu() {        
        plateau = new IhmPlateau();
        
        this.setLayout(new BorderLayout());
        this.add(plateau, BorderLayout.CENTER);
        
        //this.add(new JLabel(new ImageIcon("src/Data/robot_monopoly.jpg")), BorderLayout.CENTER);
        this.add(this.controle(), BorderLayout.EAST);
        
        afficher();
    }
    
    private JPanel controle() {
        JPanel controle = new JPanel();
        controle.add(new JLabel("controle"));
        
        
        return controle;
    }
    
    public void afficher() {
        this.setTitle("Monopoly");
        this.setSize(1000, 1000);
        this.setVisible(true);
    }
}
