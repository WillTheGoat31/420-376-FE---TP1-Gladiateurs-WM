package personnages;



public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    
    
    protected String nom;
    protected int pointsDeVie;
    protected int valeurMaxAttaque;
    protected int valeurDefence;
    protected int initiative;
    

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        
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
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
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
   // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() 
    {
        System.out.println(nom);
        System.out.println("    Attaque : " + valeurMaxAttaque);
        System.out.println("    Défence : " + valeurDefence);
        System.out.println("    Point de vie : " + pointsDeVie);
        System.out.println("    Initiative : " + initiative);
        
        if (pointsDeVie <= 0) 
        {
           System.out.println("    Statut : " + "Mort");
        }else System.out.println("    Statut : " + "Vivant");
            
        
        
    }

    private int attaqueCalcul() {
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        
        int attaque = (int)(Math.random()*(valeurMaxAttaque-0));
        
        return attaque;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        
        int dommages = attaqueCalcul() - personnageCible.valeurDefence;
        int dommagesFinal = dommages - personnageCible.valeurDefence;
        
         if (dommages < 0) {
            dommages = 0;
        }
         if (dommagesFinal < 0) {
            dommagesFinal = 0;
        }
         
        
        
        //personnageCible.setPointsDeVie(pointsDeVie) = personnageCible.pointsDeVie - dommages;
        personnageCible.setPointsDeVie(personnageCible.getPointsDeVie()-dommages);
        
        // A REFAIRE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println(nom + " attaque avec une puissance de : " + dommages);
        System.out.println(personnageCible.nom + " a une défence de : " + personnageCible.valeurDefence);
        System.out.println("Les dommages sont donc de : " + dommagesFinal);
    }

    public void setNewInitiativeRandom() {
        initiative = (int)(Math.random()*(100-0));
    }
    
    public boolean estFouetter()
    {
        int chanceFouet = (int)(Math.random()*(100-0));
        boolean estFouet = false;
        
        if (chanceFouet <= 10) {
            estFouet = true;
        }
        
        return estFouet;
    }
    
}
