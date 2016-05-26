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
    public Joueur proprietairePropriete;
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
    
    //Monopoly
    private HashMap<String, Carreau> carreauxMonopoly = new HashMap<>();
    private ArrayList<Joueur> joueursMonopoly = new ArrayList<Joueur>();
    
    //ProprieteAConstruire
    private Groupe groupePropriete;
    public Resultat(Groupe groupePropriete) {
        this.setGroupePropriete(groupePropriete);
    }
    
    //Groupe
    private CouleurPropriete couleurGroupe;
    public ArrayList<ProprieteAConstruire> proprietesGroupe = new ArrayList<ProprieteAConstruire>();
    public Resultat(CouleurPropriete couleurGroupe) {
        this.setCouleurGroupe(couleurGroupe);
    }
    
    //Joueur
    private String nomJoueur;
    private int cashJoueur;
    private Carreau positionCouranteJoueur;
    public ArrayList<Gare> garesJoueur = new ArrayList<Gare>();
    public ArrayList<Compagnie> compagniesJoueur = new ArrayList<Compagnie>();
    public ArrayList<ProprieteAConstruire> proprietesAconstruireJoueur = new ArrayList<ProprieteAConstruire>();
    public Resultat(String nomJoueur, int cashJoueur, Carreau positionCouranteJoueur) {
        this.setNomJoueur(nomJoueur);
        this.setCashJoueur(cashJoueur);
        this.setPositionCouranteJoueur(positionCouranteJoueur);
    }
    
    //Constructeur Vide
    public Resultat() {
        this.setPrixPropriete(-1);
        this.setLoyerPropriete(-1);
        this.setNumeroCarreau(-1);
        this.setNomCarreau(null);
        this.setNomJoueur(null);
        this.setCashJoueur(-1);
        //this.setProprietairePropriete(new Joueur(nomJoueur, positionCouranteJoueur));
        //this.setPositionCouranteJoueur(new AutreCarreau(numeroCarreau, nomCarreau));
    }
    
    //Tout construire
    public Resultat(int prixPropriete, int loyerPropriete, Joueur proprietairePropriete, int numeroCarreau, String nomCarreau, Groupe groupePropriete, CouleurPropriete couleurGroupe, String nomJoueur, int cashJoueur, Carreau positionCouranteJoueur) {
        this.setPrixPropriete(prixPropriete);
        this.setLoyerPropriete(loyerPropriete);
        this.setProprietairePropriete(proprietairePropriete);
        this.setNumeroCarreau(numeroCarreau);
        this.setNomCarreau(nomCarreau);
        this.setGroupePropriete(groupePropriete);
        this.setCouleurGroupe(couleurGroupe);
        this.setNomJoueur(nomJoueur);
        this.setCashJoueur(cashJoueur);
        this.setPositionCouranteJoueur(positionCouranteJoueur);
    }
//Getters

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

    public HashMap<String, Carreau> getCarreauxMonopoly() {
        return carreauxMonopoly;
    }

    public ArrayList<Joueur> getJoueursMonopoly() {
        return joueursMonopoly;
    }

    public Groupe getGroupePropriete() {
        return groupePropriete;
    }

    public CouleurPropriete getCouleurGroupe() {
        return couleurGroupe;
    }

    public ArrayList<ProprieteAConstruire> getProprietesGroupe() {
        return proprietesGroupe;
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public int getCashJoueur() {
        return cashJoueur;
    }

    public Carreau getPositionCouranteJoueur() {
        return positionCouranteJoueur;
    }

    public ArrayList<Gare> getGaresJoueur() {
        return garesJoueur;
    }

    public ArrayList<Compagnie> getCompagniesJoueur() {
        return compagniesJoueur;
    }

    public ArrayList<ProprieteAConstruire> getProprietesAconstruireJoueur() {
        return proprietesAconstruireJoueur;
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

    public void setCarreauxMonopoly(HashMap<String, Carreau> carreauxMonopoly) {
        this.carreauxMonopoly = carreauxMonopoly;
    }

    public void setJoueursMonopoly(ArrayList<Joueur> joueursMonopoly) {
        this.joueursMonopoly = joueursMonopoly;
    }

    public void setGroupePropriete(Groupe groupePropriete) {
        this.groupePropriete = groupePropriete;
    }

    public void setCouleurGroupe(CouleurPropriete couleurGroupe) {
        this.couleurGroupe = couleurGroupe;
    }

    public void setProprietesGroupe(ArrayList<ProprieteAConstruire> proprietesGroupe) {
        this.proprietesGroupe = proprietesGroupe;
    }

    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }

    public void setCashJoueur(int cashJoueur) {
        this.cashJoueur = cashJoueur;
    }

    public void setPositionCouranteJoueur(Carreau positionCouranteJoueur) {
        this.positionCouranteJoueur = positionCouranteJoueur;
    }

    public void setGaresJoueur(ArrayList<Gare> garesJoueur) {
        this.garesJoueur = garesJoueur;
    }

    public void setCompagniesJoueur(ArrayList<Compagnie> compagniesJoueur) {
        this.compagniesJoueur = compagniesJoueur;
    }

    public void setProprietesAconstruireJoueur(ArrayList<ProprieteAConstruire> proprietesAconstruireJoueur) {
        this.proprietesAconstruireJoueur = proprietesAconstruireJoueur;
    }

    //Autres Méthodes
    
}
