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

    
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
    
    
    Bob.afficherInfosPersonnage();
    System.out.println("");
    Igor.afficherInfosPersonnage();
    // TODO : Afficher le message du début du combat
    // </editor-fold>
    System.out.println("");
    
    System.out.println("<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
    System.out.println("<<<<< Que le combat commence ! >>>>>");
    System.out.println("<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");

    System.out.println("");
    

    tour.afficheTour();
    tour.augmenteTour();
    tour.afficheTour();
    tour.augmenteTour();
    tour.augmenteTour();
    tour.afficheTour();
        
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
    // TODO : La boucle contenant les étapes du combat
    // TODO : Après la boucle, afficher le résultat du combat
    // </editor-fold>
    }

}
