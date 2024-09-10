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
        // TODO : Constructeur AVEC paramètres
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
    }
    public void setValeurDefence(int valeurDefence) {
        this.valeurDefence = valeurDefence;
    }
    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }
    
    
    
    //AFFICHER ---------------------------
    public void afficherInfosPersonnage() {
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
    );
        
    }

    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
    }

    private int attaqueCalcul() {
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        return 0;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : Récupérer la valeur d'attaque pour ce tour, calculer les dégats,
        //modifier les points de vie du personnage cible, afficher les détails
        // sur l'attaque, tel que montré dans l'énoncé.
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
    }
    // </editor-fold>
}
