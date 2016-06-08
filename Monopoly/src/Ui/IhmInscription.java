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
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author fallm
 */
public class IhmInscription extends JFrame  {
    private Observateur observateur;
    
    private int nbjoueurs = 2;
    private JPanel inscriptions;
    private JPanel gestionJoueurs;
    private JPanel choix;
    private JLabel joueur1; private JTextField champJ1;
    private JLabel joueur2; private JTextField champJ2;
    private JLabel joueur3; private JTextField champJ3;
    private JLabel joueur4; private JTextField champJ4;
    private JLabel joueur5; private JTextField champJ5;
    private JLabel joueur6; private JTextField champJ6;
    private String nomJ1;
    private String nomJ2;
    private String nomJ3;
    private String nomJ4;
    private String nomJ5;
    private String nomJ6;
    private ArrayList<String> joueurs = new ArrayList<>();
    private IhmJeu ihmJeu;
    
    
    
    
    public IhmInscription() {
        super();

        initUIComponents();
    }
    
     public void setObservateur(Observateur observateur) {
        this.observateur = observateur;
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
                    quitter();
                }
            }
        });
        jouer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean res = IhmBoiteMessage.afficherBoiteDialogue("Souhaitez vous lancer la partie avec " + nbjoueurs + " joueurs ?", "ouinon");
                if (res) {
                    joueurs = jouer();
                    setVisible(false);
                    //On lance la fenêtre de jeu
                     ihmJeu = new IhmJeu(); // A ENLEVER D'ICI 
                    observateur.jouer(joueurs);
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
        setSize(350, 250);
        setVisible(true);                        
    }

    public void quitter() {
        boolean res = IhmBoiteMessage.afficherBoiteDialogue("A bientôt", "info");
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));//Permet de fermer la fenêtre
    }
    
    public ArrayList<String> jouer() {  
        ArrayList<String> res = new ArrayList<>();
        //On récupère les données des champs textes
        nomJ1 = champJ1.getText();
        nomJ2 = champJ2.getText();
        nomJ3 = champJ3.getText();
        nomJ4 = champJ4.getText();
        nomJ5 = champJ5.getText();
        nomJ6 = champJ6.getText();
        
        //On place les données dans l'ArrayList en fonction du nombre de joueurs
        res.add(nomJ1);
        res.add(nomJ2);
        if (nbjoueurs>2) {res.add(nomJ3);
            if (nbjoueurs>3) {res.add(nomJ4);
                if (nbjoueurs>4) {res.add(nomJ5);
                    if (nbjoueurs==6) {res.add(nomJ6);}
                }      
            } 
        }
        return res;
    }

   
    

    public ArrayList<String> getJoueurs() {
        return joueurs;
    }
    
    
}
