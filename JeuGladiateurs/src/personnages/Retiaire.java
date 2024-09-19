package personnages;

/**
 *
 * @author 202334141
 */
public class Retiaire extends Personnage{
    
    //VARIABLE
    protected boolean aSonFillet = true;
    
    protected String classe;

    public void setClasse() {
        this.classe = "Retillaire";
    }

    public String getClasse() {
        return classe;
    }
    
    //CONSTRUCTEUR
    public Retiaire(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
        initiative = 30;
    }

    public Retiaire() {
    }

    
    @Override
    public void setInitiative(int initiative) {
        this.initiative = initiative;
        
    }
    
    @Override
    public void afficherInfosPersonnage()
    {
        super.afficherInfosPersonnage();
        System.out.println("    Classe : " + this.getClasse());
    }
    
}
