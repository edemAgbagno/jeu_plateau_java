/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu;

/**
 *
 * @author AGBAGNO
 */
public class Joueur {
    
    //Les attributs de la classe
    private int credit;
    private String nom;
    
    //les accesseurs
    public void setCredit(int c){
         this.credit=c;
    }
    private void setNom(String nom){
        this.nom=nom;
    }
    public int getCredit(){
        return this.credit;
    }
    public String getNom(){
        return this.nom;
    }
    
    //Constructeur
    public Joueur(String nom){
        this.credit=0;
        this.setNom(nom);
    }
    
    
    
    
    
}
