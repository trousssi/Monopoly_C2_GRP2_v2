/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jeu;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author trousssi
 */
public class Resultat {
//Attributs
    //Propriété
    private int prixPropriete;
    private int loyerPropriete;
    public Joueur proprietairePropriete;
    //Carreau
    private int numeroCarreau;
    private String nomCarreau;
    //Monopoly
    private HashMap<String, Carreau> carreauxMonopoly = new HashMap<>();
    private ArrayList<Joueur> joueursMonopoly = new ArrayList<Joueur>();
    //ProprieteAConstruire
    private Groupe groupePropriete;
    //Groupe
    private CouleurPropriete couleurGroupe;
    public ArrayList<ProprieteAConstruire> proprietesGroupe = new ArrayList<ProprieteAConstruire>();
    //Joueur
    private String nomJoueur;
    private int cashJoueur;
    private Carreau positionCouranteJoueur;
    public ArrayList<Gare> garesJoueur = new ArrayList<Gare>();
    public ArrayList<Compagnie> compagniesJoueur = new ArrayList<Compagnie>();
    public ArrayList<ProprieteAConstruire> proprietesAconstruireJoueur = new ArrayList<ProprieteAConstruire>();
//Constructeurs
    //Vide
    public Resultat() {
        this.prixPropriete = 0;
        this.loyerPropriete = 0;
        this.proprietairePropriete = new Joueur(nomJoueur, positionCouranteJoueur);
        this.numeroCarreau = 0;
        this.nomCarreau = "CARREAU";
        this.nomJoueur = "JOUEUR";
        this.cashJoueur = 0;
        this.positionCouranteJoueur = new AutreCarreau(numeroCarreau, nomCarreau);
    }
    //Tout
    public Resultat(int prixPropriete, int loyerPropriete, Joueur proprietairePropriete, int numeroCarreau, String nomCarreau, Groupe groupePropriete, CouleurPropriete couleurGroupe, String nomJoueur, int cashJoueur, Carreau positionCouranteJoueur) {
        this.prixPropriete = prixPropriete;
        this.loyerPropriete = loyerPropriete;
        this.proprietairePropriete = proprietairePropriete;
        this.numeroCarreau = numeroCarreau;
        this.nomCarreau = nomCarreau;
        this.groupePropriete = groupePropriete;
        this.couleurGroupe = couleurGroupe;
        this.nomJoueur = nomJoueur;
        this.cashJoueur = cashJoueur;
        this.positionCouranteJoueur = positionCouranteJoueur;
    }
//Getters
    
//Setters
    
//Autres Méthodes

    
}
