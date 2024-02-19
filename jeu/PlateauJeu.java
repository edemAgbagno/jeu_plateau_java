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
public class PlateauJeu {
    //attributs
    private Case[][] plateau;
    private int max;
    private int cote;
    //accesseurs
    public void setMax(int max){
        this.max=max;
    }
    public int getMax(){
       return this.max;
    }
     public void setCote(int cote){
        this.cote=cote;
    }
    public int getCote(){
       return this.cote;
    }
    
    
    //constructeur
    
    public PlateauJeu(int max){
        this.max=max;
        this.cote= (int) Math.sqrt(max);
        
        initPlateau();
        
    }
    //methode pour initialiser pour le plateau de jeu
    public void initPlateau(){
        
        plateau = new Case [cote][cote+1];
        for(int i=0;i<cote;i++){
            for(int j=0;j<cote+1;j++){
                plateau [i][j]= new Case(max);
            }
        }
    }
    // méthode d'affichage du plateau en fonction de si la case a été trouvé ou pas 
    
    public void affichePlateau(){
       for(int i=0;i<getCote();i++){
            for(int j=0;j<cote+1;j++){
               if( plateau [i][j].getGagne()==false) {
                   System.out.print("## ");
               }else{
                   System.out.print(""+plateau [i][j].getValeur());
                   System.out.print(plateau [i][j].getInd());
               }
            }
           System.out.println("") ;
        } 
    }
    
    //méthode permettant de récupérer le contenu d'une case
    public Case recupCase(int lig ,int col){
        //lig-1 et col-1 pour que le choix de l'utilisateur coincide avec le tableau 
    return plateau[lig-1][col-1];
}
    //methode permettant de saavoir si tt les caases on été trouvé
   public boolean termine(){
       int cpt=0;
       boolean fin =false;
       for(int i=0;i<getCote();i++){
            for(int j=0;j<cote+1;j++){
                
              if( plateau [i][j].getGagne()==true)  
              {
                  cpt=cpt+1;
              }
            }
       
    }
    
    if(cpt==cote*(cote+1))
        fin=true;
    
        return fin;
   }
        
        
   
}
