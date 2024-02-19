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
public class LesIndices {
    //attributs
    private final ArrayList<Indice> lstInd;
    
    //constuucteur
     public LesIndices()
    {
        this.lstInd = new ArrayList<>();
    }
    
    //Méthode permettant d'ajouter un indice
    public void ajouteIndice(Indice i)
    {
        this.lstInd.add(i);
    }
    
     //Méthode pour recupere le nombre d'ind de l'ArrayList
    public int getNbInd()
    {
        return this.lstInd.size();
    }
    
      //Méthode--> qui renvoie l'indice i donné en paramètre
    public Indice getInd(int i)
    {
        if (i>=0 && i<this.getNbInd())
             return this.lstInd.get(i);
        else
            return null;
    }
    
    
}
