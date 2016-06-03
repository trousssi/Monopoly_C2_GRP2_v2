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
//Attributs et Constructeurs
    //Propriété
    private int prixPropriete =-1;
    private int loyerPropriete =-1;
    private Joueur proprietairePropriete;
    
    private Propriete proprieteAchete;
    public Resultat(int prixPropriete, int loyerPropriete, Joueur proprietairePropriete) {
        this.setPrixPropriete(prixPropriete);
        this.setLoyerPropriete(loyerPropriete);
        this.setProprietairePropriete(proprietairePropriete);
    }
    
    
    //Carreau
    private int numeroCarreau =-1;
    private String nomCarreau;
    public Resultat(int numeroCarreau, String nomCarreau) {
        this.setNumeroCarreau(numeroCarreau);
        this.setNomCarreau(nomCarreau);
    }
    
    
    //Constructeur Vide
    public Resultat() {
        this.setPrixPropriete(-1);
        this.setLoyerPropriete(-1);
        this.setNumeroCarreau(-1);

    }
    

    public Propriete getProprieteAchete() {
        return proprieteAchete;
    }

    public void setProprieteAchete(Propriete proprieteAchete) {
        this.proprieteAchete = proprieteAchete;
    }

    public int getPrixPropriete() {
        return prixPropriete;
    }

    public int getLoyerPropriete() {
        return loyerPropriete;
    }

    public Joueur getProprietairePropriete() {
        return proprietairePropriete;
    }

    public int getNumeroCarreau() {
        return numeroCarreau;
    }

    public String getNomCarreau() {
        return nomCarreau;
    }

    
    
//Setters
    public void setPrixPropriete(int prixPropriete) {
        this.prixPropriete = prixPropriete;
    }

    public void setLoyerPropriete(int loyerPropriete) {
        this.loyerPropriete = loyerPropriete;
    }

    public void setProprietairePropriete(Joueur proprietairePropriete) {
        this.proprietairePropriete = proprietairePropriete;
    }

    public void setNumeroCarreau(int numeroCarreau) {
        this.numeroCarreau = numeroCarreau;
    }

    public void setNomCarreau(String nomCarreau) {
        this.nomCarreau = nomCarreau;
    }
    
}