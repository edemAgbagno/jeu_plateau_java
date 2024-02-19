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
public class Case {
    //les attributs
    private Indice ind;
    private int valeur;
    private LesIndices lst;
    private boolean gagne;
   

//  les accesseurs

  public void setInd(Indice ind){
      this.ind=ind;
  }
  public void setValeur(int val){
      this.valeur=val;
  }
 
  public void setGagne(boolean gagne){
      this.gagne=gagne;
  }
  
  public char getInd(){
      char res =this.ind.getSigne();
        return res;           
  }
  
  public int getValeur(){
      return this.valeur;
  }
  
  public boolean getGagne(){
      return this.gagne;
  }
  
  
  //constructeur
  public Case( int max){
      
      lst= new LesIndices();
      this.valeur= (int) (1 +Math.random()*max);
      this.gagne= false;
      initListe();
      setInd(choix());
      
      
  }
  
  
  //methode pour initialise la liste
  private void initListe(){
      lst.ajouteIndice(new IndSoustraction());
      lst.ajouteIndice(new IndMultiplie());
      lst.ajouteIndice(new IndAddition());
      lst.ajouteIndice(new IndDivision()); 
  }
  
  //methode pour attribué uun indice par hasard
  private Indice choix(){
      int i= (int) (Math.random()*lst.getNbInd());
      return lst.getInd(i);
  }
  
  
    
}
