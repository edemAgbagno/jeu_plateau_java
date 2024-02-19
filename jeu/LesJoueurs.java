/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu;

import java.util.ArrayList;

/**
 *
 * @author AGBAGNO
 */
public class LesJoueurs {
    //Attributs
    private final ArrayList<Joueur> lstJoueurs;//Collection de joueur pour gèrer l'ensemble des joueurs 
    
    
    //Constructeur par défaut de la classe LesJoueurs--> ne prend pas de paramètre
    //permet d'initialiser l'attribut de la classe
    public LesJoueurs()
    {
        this.lstJoueurs = new ArrayList<>();
    }
    
    //Méthode permettant d'ajouter un joueur grace au nom saisi
    public void ajouteJoueur(String s)
    {
        Joueur j=new Joueur(s);
        this.lstJoueurs.add(j);
    }
    
    //Méthode pour recupere le nombre de joueur de l'ArrayList
    public int getNbJoueurs()
    {
        return this.lstJoueurs.size();
    }
    
      //Méthode--> qui renvoie un joueur d'indice i donné en paramètre
    public Joueur getJoueur(int i)
    {
        if (i>=0 && i<this.getNbJoueurs())
             return this.lstJoueurs.get(i);
        else
            return null;
    }
    
}
