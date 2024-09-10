package personnages;



public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    
    
    private String nom;
    private int pointsDeVie;
    private int valeurMaxAttaque;
    private int valeurDefence;
    private int initiative;
    

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        // TODO : Constructeur AVEC param�tres
    }

    public Personnage() {
        nom = "";
        pointsDeVie = 0;
        valeurMaxAttaque = 0;
        valeurDefence = 0;
        initiative = 0;

    }
    // </editor-fold>

    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    
    //GETTER --------------------------------------
    public int getInitiative() {
        return initiative;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public String getNom() {
        return nom;
    }

    public int getValeurDefence() {
        return valeurDefence;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }
    
    
    //SETTER -------------------------------
    public void setInitiative(int initiative) {
        this.initiative = initiative;
        // TODO : Afficher les infos du personnage, tel que montr� dans l'�nonc�
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
        if (this.pointsDeVie < 0) {
            this.pointsDeVie = 0;
        }
    }
    public void setValeurDefence(int valeurDefence) {
        this.valeurDefence = valeurDefence;
    }
    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }
    
    
    

    // **************************************************************************
    // **************************************************************************
   // <editor-fold defaultstate="collapsed" desc="M�canique de jeu">
    public void afficherInfosPersonnage() 
    {
        System.out.println(nom);
        System.out.println("    Attaque : " + valeurMaxAttaque);
        System.out.println("    D�fence : " + valeurDefence);
        System.out.println("    Point de vie : " + pointsDeVie);
        System.out.println("    Initiative : " + initiative);
        
        if (pointsDeVie <= 0) 
        {
           System.out.println("    Statut : " + "Mort");
        }else System.out.println("    Statut : " + "Vivant");
            
        
        
    }

    private int attaqueCalcul() {
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouv�e al�atoirement et doit se situer entre Z�RO et valeurMaxAttaque.
        
        int attaque = (int)(Math.random()*(valeurMaxAttaque-0));
        
        return attaque;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : R�cup�rer la valeur d'attaque pour ce tour, calculer les d�gats,
        //modifier les points de vie du personnage cible, afficher les d�tails
        // sur l'attaque, tel que montr� dans l'�nonc�.
        
         
        int dommages = attaqueCalcul() - personnageCible.valeurDefence;
        
        
        if (dommages < 0) {
            dommages = 0;
        }
        
        personnageCible.pointsDeVie = personnageCible.pointsDeVie - dommages;
        
        
        // A REFAIRE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println(personnageCible.nom + " attaque avec une puissance de : " + dommages);
        System.out.println(personnageCible.nom + " a une d�fence de : " + personnageCible.valeurDefence);
        System.out.println("Les dommages sont donc de : " + (dommages - personnageCible.valeurDefence));
    }

    public void setNewInitiativeRandom() {
        initiative = (int)(Math.random()*(100-0));
    }
    // </editor-fold>
}
