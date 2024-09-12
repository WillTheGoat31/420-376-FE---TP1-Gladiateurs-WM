package jeugladiateurs;


import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;

public class JeuGladiateurs {

    public static void main(String[] args) {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
    CompteurDeTour tour = new CompteurDeTour();
    AffichageEcran affichage = new AffichageEcran();
    Personnage Bob = new Personnage();
    Personnage Igor = new Personnage();
    
    
    //BOB
    Bob.setNom("Bob le malchanceux");
    Bob.setPointsDeVie(70);
    Bob.setValeurMaxAttaque(15);
    Bob.setValeurDefence(15);
    Bob.setInitiative(15);
    
    
    //IGOR
    Igor.setNom("Igor l'empaleur");
    Igor.setPointsDeVie(100);
    Igor.setValeurMaxAttaque(25);
    Igor.setValeurDefence(5);
    Igor.setInitiative(30);
    // </editor-fold>

    
    //JEU------------------------------------------------------------------------
    // **************************************************************************
    // **************************************************************************
   
    
    affichage.afficherDebutCombat();
    System.out.println("");
    
    while(Bob.getPointsDeVie() > 0 || Igor.getPointsDeVie() > 0)
    {
        tour.afficheTour();
    
        for (int i = 0; i < 100; i++) 
        {
            if (i == Bob.getInitiative())
            {
                Bob.frapperPersonnage(Igor);
                System.out.println("");
                Igor.frapperPersonnage(Bob);
                break;
            }
            if(i == Igor.getInitiative())
            {
                Igor.frapperPersonnage(Bob);
                System.out.println("");
                Bob.frapperPersonnage(Igor);
                break;
            }
        }
        
        affichage.afficherSeparateurInfosPerso();
        
        Bob.afficherInfosPersonnage();
        System.out.println("");
        Igor.afficherInfosPersonnage();
        
        Bob.setNewInitiativeRandom();
        Igor.setNewInitiativeRandom();
        tour.augmenteTour();
        affichage.afficherSeparateurDeTour();
    }
    
    
        
    //BOUCLE FINI 
        
    }

}
