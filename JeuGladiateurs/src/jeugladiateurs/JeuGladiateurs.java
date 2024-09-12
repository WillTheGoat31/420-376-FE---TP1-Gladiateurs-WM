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
    // <editor-fold defaultstate="collapsed" desc="Affichage pr�-combat">
    
    
    Bob.afficherInfosPersonnage();
    System.out.println("");
    Igor.afficherInfosPersonnage();
    affichage.afficherDebutCombat();
    
    
    // </editor-fold>
    System.out.println("");
    

    System.out.println("");
    
   
    
    
    

   
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="M�canique de combat">
    // TODO : La boucle contenant les �tapes du combat
    // TODO : Apr�s la boucle, afficher le r�sultat du combat
    // </editor-fold>
    }

}
