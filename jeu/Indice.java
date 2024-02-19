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
public abstract class Indice {
    
    //les attributs
    private char signe;
    
    //les accesseurs
    public void setSigne(char signe){
      this.signe=signe;  
    }
    public char getSigne(){
        return this.signe;
    }
    
    
    //construucteur
    public Indice(char signe){
        this.signe=signe;
    }
    
    
    
    
}
