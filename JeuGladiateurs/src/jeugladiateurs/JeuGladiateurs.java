package jeugladiateurs;


import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;
import personnages.Mirmillon;
import personnages.Retiaire;

public class JeuGladiateurs {

    public static void main(String[] args) {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
    CompteurDeTour tour = new CompteurDeTour();
    AffichageEcran affichage = new AffichageEcran();
    Mirmillon Bob = new Mirmillon("Bob", 70, 15, 15, 15);
    Retiaire Igor = new Retiaire("Igor", 100, 25, 5, 30);
    
    
    //BOB
    Bob.setNom("Bob le malchanceux");
    Bob.setPointsDeVie(70);
    Bob.setValeurMaxAttaque(15);
    Bob.setValeurDefence(15);
    Bob.setInitiative(15);
    Bob.setClasse();
    
    
    //IGOR
    Igor.setNom("Igor l'empaleur");
    Igor.setPointsDeVie(100);
    Igor.setValeurMaxAttaque(25);
    Igor.setValeurDefence(5);
    Igor.setInitiative(30);
    Igor.setClasse();
    // </editor-fold>

    
    //JEU------------------------------------------------------------------------
    // **************************************************************************
    // **************************************************************************
   
    
    affichage.afficherDebutCombat();
    System.out.println("");
    
    while(Bob.getPointsDeVie() > 0 && Igor.getPointsDeVie() > 0)
    {
        tour.afficheTour();
    
        for (int i = 0; i < 100; i++) 
        {
            if (i == Bob.getInitiative())
            {
                Bob.frapperPersonnage(Igor);
                if (Igor.getPointsDeVie() <= 0) {
                    System.out.println("");
                    System.out.println("Bob a décapité Igor!");
                    break;
                }
                
                System.out.println("");
                Bob.frapperPersonnage(Igor);
                    
                System.out.println("");
                Igor.frapperPersonnage(Bob);
                break;
            }
            
            if(i == Igor.getInitiative())
            {
                System.out.println("Igor lance son fillet!");
                System.out.println("");
                if (Bob.estFouetter()) {
                   System.out.println("Son filet attrape Bob le malchanceux et il l?empale sauvagement avec sa lance");
                   
                }
                else
                {
                    Igor.frapperPersonnage(Bob);
                    System.out.println("");
                    Bob.frapperPersonnage(Igor);
                }
                
                
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
    
    affichage.afficheVictoire(Bob, Igor);
    
        
    
        
    }

}
