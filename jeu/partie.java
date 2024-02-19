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
public class partie {
    //attributs
    private final LesJoueurs lstJ;
    private PlateauJeu plateau;
    private TourJoueur tour;
    
   //construucteur
   
    public  partie()
    {
     this.lstJ=new LesJoueurs();
     
    }
    //méthode concernant l'affichage
    public void affichage()
    { 
        char test;
        System.out.println("Qui sont les joueurs ?");
        //condition d'ajout des joueurs
        do{
        System.out.print("Nom du joueur : ");
        String nom=Lire.S();
        lstJ.ajouteJoueur(nom);
        System.out.print(" joueur  supplémentaire (oui/non) : ");
        test=Lire.c();
        }while(test!='n');
        
        //caractéristiques du jeu
        System.out.println(" les caractéristiques du jeu :");
        System.out.println("Les Joueurs");
        System.out.println("________________");
        for(int i=0;i<lstJ.getNbJoueurs();i++)
        {
           System.out.println("Joueur " +lstJ.getJoueur(i).getNom() +" Score " +lstJ.getJoueur(i).getCredit() ); 
        }
        System.out.println("________________");
        System.out.println("Les natures d'indices : 'x','+',':','*' ");
        System.out.println("Valeur maximale des cases :");
        int max=Lire.i();
        
        //creéation du plateaau et affichage
        this.plateau= new PlateauJeu(max);
        this.plateau.affichePlateau();
        //tour des joueurs
        do
        for(int i=0;i<lstJ.getNbJoueurs();i++)
        {
            this.tour= new TourJoueur(lstJ.getJoueur(i) ,this.plateau);
            this.tour.initTour();
        }
        while(plateau.termine());
    }
    
}
