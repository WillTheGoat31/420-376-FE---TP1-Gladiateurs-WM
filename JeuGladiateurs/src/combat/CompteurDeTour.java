package combat;

public class CompteurDeTour {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    // TODO : Mettre vos attributs ici
    // </editor-fold>
    
    private int cptrTour;
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public CompteurDeTour() {
        cptrTour = 1;
    }

    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    public int getCptrTour() {
        return cptrTour;
    }
    public void setCptrTour(int cptrTour) {
        this.cptrTour = cptrTour;
    }
    
    

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void augmenteTour() {
        cptrTour += 1;
    }

    public void afficheTour() {
        System.out.println("---------------");
        System.out.println("TOUR ACTUEL : " + cptrTour);
        System.out.println("---------------");
    }
    
}
