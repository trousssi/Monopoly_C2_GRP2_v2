/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author fallm
 */
public class IhmInscription extends JFrame implements ActionListener {
    int nbjoueurs = 2;
    JPanel inscriptions;
    JPanel gestionJoueurs;
    JPanel choix;
    JLabel joueur1; JTextField champJ1;
    JLabel joueur2; JTextField champJ2;
    JLabel joueur3; JTextField champJ3;
    JLabel joueur4; JTextField champJ4;
    JLabel joueur5; JTextField champJ5;
    JLabel joueur6; JTextField champJ6;
    
    public IhmInscription() {
        super();

        initUIComponents();
    }
    
    private void initUIComponents() {
        this.setLayout((new BorderLayout()));
        gestionJoueurs = new JPanel(); 
        inscriptions = new JPanel();
        choix = new JPanel();
        ///**NORD**///
        this.add(gestionJoueurs, BorderLayout.NORTH);
        gestionJoueurs.setLayout((new BorderLayout()));
        JButton ajouter = new JButton("Ajouter un Joueur");
        JButton retirer = new JButton("Retirer un Joueur");
        gestionJoueurs.add(ajouter, BorderLayout.EAST);
        gestionJoueurs.add(retirer, BorderLayout.WEST);

        
        ///**CENTRE**///
        this.add(inscriptions, BorderLayout.CENTER);
        inscriptions.setLayout(new GridLayout(7,2));
        inscriptions.add(new JLabel("De 2 à 6 joueurs"));
        inscriptions.add(new JLabel("Entrez le nom des joueurs:"));
        joueur1 = new JLabel("Joueur 1:");champJ1 = new JTextField();
        joueur2 = new JLabel("Joueur 2:");champJ2 = new JTextField();
        joueur3 = new JLabel("Joueur 3:");champJ3 = new JTextField();
        joueur4 = new JLabel("Joueur 4:");champJ4 = new JTextField();
        joueur5 = new JLabel("Joueur 5:");champJ5 = new JTextField();
        joueur6 = new JLabel("Joueur 6:");champJ6 = new JTextField();
        inscriptions.add(joueur1);inscriptions.add(champJ1);
        inscriptions.add(joueur2);inscriptions.add(champJ2);
        inscriptions.add(joueur3);inscriptions.add(champJ3);
        inscriptions.add(joueur4);inscriptions.add(champJ4);
        inscriptions.add(joueur5);inscriptions.add(champJ5);
        inscriptions.add(joueur6);inscriptions.add(champJ6);
        joueur1.setVisible(true);champJ1.setVisible(true);
        joueur2.setVisible(true);champJ2.setVisible(true);
        joueur3.setVisible(false);champJ3.setVisible(false);
        joueur4.setVisible(false);champJ4.setVisible(false);
        joueur5.setVisible(false);champJ5.setVisible(false);
        joueur6.setVisible(false);champJ6.setVisible(false);
        traceInscriptions();
                
        ///**SUD**///
        this.add(choix, BorderLayout.SOUTH);
        choix.setLayout((new BorderLayout()));
        JButton jouer = new JButton("Jouer");
        JButton quitter = new JButton("Quitter");
        choix.add(jouer, BorderLayout.EAST);
        choix.add(quitter, BorderLayout.WEST);
        
        ///**GESTION DES BOUTONS**///
        ajouter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addJoueur();
            }
        });
        retirer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeJoueur();
            }
        });
        quitter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean res = IhmBoiteMessage.afficherBoiteDialogue("Etes vous sûr de vouloir quitter?", "ouinon");
                if (res) {
                    //Quitter
                }
            }
        });
        jouer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean res = IhmBoiteMessage.afficherBoiteDialogue("Souhaitez vous lancer la partie avec " + nbjoueurs + " joueurs ?", "ouinon");
                if (res) {
                    //Quitter
                }
            }
        });
    }   
    
    public void addJoueur() {
        if (nbjoueurs<6) {nbjoueurs++;}
        traceInscriptions();

        
    }
    
    public void removeJoueur() {
        if (nbjoueurs>2) {nbjoueurs--;}        
        traceInscriptions();
    }
    
    public void traceInscriptions() { //Algorithme d'ajout ou de suppression de champ de création de joueur
        if (nbjoueurs>2) {
            joueur3.setVisible(true);champJ3.setVisible(true);
            if (nbjoueurs>3) {
                joueur4.setVisible(true);champJ4.setVisible(true);
                if (nbjoueurs>4) {
                    joueur5.setVisible(true);champJ5.setVisible(true);
                    if (nbjoueurs==6) {
                        joueur6.setVisible(true);champJ6.setVisible(true);
                    } else {
                        joueur6.setVisible(false);champJ6.setVisible(false); 
                    }
                } else {
                    joueur5.setVisible(false);champJ5.setVisible(false);
                    joueur6.setVisible(false);champJ6.setVisible(false); 
                }
            } else {
                joueur4.setVisible(false);champJ4.setVisible(false);
                joueur5.setVisible(false);champJ5.setVisible(false);
                joueur6.setVisible(false);champJ6.setVisible(false); 
            }
        } else {
            joueur3.setVisible(false);champJ3.setVisible(false);
            joueur4.setVisible(false);champJ4.setVisible(false);
            joueur5.setVisible(false);champJ5.setVisible(false);
            joueur6.setVisible(false);champJ6.setVisible(false); 
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

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
