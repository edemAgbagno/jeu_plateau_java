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
public class TourJoueur {
    //attributs
   private Joueur joueur;
   private PlateauJeu plateau;
   private Case choix1;
   private Case choix2;
   //variable
   int lig1;
   int col1;
   int lig2;
   int col2;
   
   //accesseurs
   public void setJoueur(Joueur j){
       this.joueur=j;
   }
   public Joueur getJoueur(){
       return this.joueur;
   }
   public void setPlateau(PlateauJeu p){
       this.plateau=p;
   }
   public PlateauJeu getPlateau(){
       return this.plateau;
   }
   private void setChoix1(int i,int j){
       this.choix1=this.plateau.recupCase(i, j) ;
   }
   private Case getChoix1(){
       return this.choix1;
   }
  private void setChoix2(int i,int j){
       this.choix2=this.plateau.recupCase(i, j) ;
   }
   private Case getChoix2(){
       return this.choix2;
   }
   
   
   //constructeurs 
   public TourJoueur( Joueur j,PlateauJeu p){
       this.joueur=j;
       this.plateau=p;
       
   }
   
   //méthode pour initialiser les questions pour le joueur
   
   public void initTour(){
       System.out.println("Joueur "+this.joueur.getNom()+". Score:"+this.joueur.getCredit()+". Joue");
       System.out.println("");
       System.out.println("");
       System.out.println("Choix de la première case");
       System.out.println("Numéro de ligne entre 1 et "+this.plateau.getCote());
        lig1= Lire.i();
       System.out.println("Numéro de colonne entre 1 et "+(this.plateau.getCote()+1));
        col1=Lire.i();
       this.setChoix1(lig1,col1);
       
       System.out.println("");
       System.out.println("");
       System.out.println("Choix de la deuuxième case");
       System.out.println("Numéro de ligne entre 1 et "+this.plateau.getCote());
        lig2= Lire.i();
       System.out.println("Numéro de colonne entre 1 et "+(this.plateau.getCote()+1));
        col2=Lire.i();
       this.setChoix2(lig2,col2);
       
       System.out.println("");
       System.out.println("");
       System.out.println("Indice de la première case :"+afficheIndice(this.choix1,this.choix2));
       System.out.println("Indice de la deuxième case :"+afficheIndice(this.choix2,this.choix1));
       
       //hypothèse
       hypothese();
       
      System.out.println("");
       
   }
   
   
   //Méthode permettaant de donner une idée des indices concernant les cases choisi paar le joueur
   private int afficheIndice(Case c1,Case c2){
   int res=0;
switch (c1.getInd())
{
    case '+' : res= c1.getValeur()+c2.getValeur() ; break;
    case '-' : res= c1.getValeur()-c2.getValeur()  ; break;
    case ':' : res= c1.getValeur()/c2.getValeur()  ; break;
    case '*' : res= c1.getValeur()*c2.getValeur()  ; break;
}  
    return res;   
   }
   
   //Méthode pour demander au joueur s'il a des hypothèses 
   private void hypothese(){
       
       // demande au joueur s'il a des hypothèses ou non
       System.out.println("Veux-tu faire des hypothèses sur les valeurs des cases choisies (oui/non)");
       char res= Lire.c();
       
       //test paar rapport au choix du joueur
       switch (res) {
           case 'o':
               System.out.println("valeur de la première case") ;
               int i=Lire.i();
               System.out.println("valeur de la deuxième  case") ;
               int j=Lire.i();
               if(i==choix1.getValeur()&&j==choix2.getValeur())
               {
                   int score=choix1.getValeur()+choix2.getValeur();
                   System.out.println("Bravo ! Le contenu des cases a été trouvé ! ");
                   //on met les cases gagnés en affichage
                   this.plateau.recupCase(lig1, col1).setGagne(true);
                   this.plateau.recupCase(lig2, col2).setGagne(true);
                   joueur.setCredit(score);
                   System.out.println("Joueur " +joueur.getNom() +" Score " +joueur.getCredit() );
               }
               else
               {
                   System.out.println("désolé ! Au moins une des hypothèses est fausse");
               }    break;
           case 'n':
               System.out.println("Joueur " +joueur.getNom() +" Score " +joueur.getCredit() );
               break;
           default:
               System.out.println(" saisissez o/n");
               break;
       }
       
       plateau.affichePlateau();
       
   }
   

}
