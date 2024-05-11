package essaie;

public class ControlJeuPirate {
    
    
    private ControlLancerDe controlLancerDe;
    
    private IBoundary iBoundary;

    public ControlJeuPirate(ControlLancerDe controlLancerDe, IBoundary iBoundary) {
        this.controlLancerDe = controlLancerDe;
        this.iBoundary = iBoundary;
    }
    
    public void jouer(){
        
        //Viens le lancé du dé
        iBoundary.setILancerDe(controlLancerDe);
        int valDes  = iBoundary.lancerDe();
        System.out.println("[ControlJeuPirate] Valeur du de recupere : " + String.valueOf(valDes));
        //Action...
    }
    
    public static void main(String[] args) {
        ControlLancerDe controlLancerDe = new ControlLancerDe();
        BoundaryJeuPirate boundaryJeuPirate = new BoundaryJeuPirate();
        
        ControlJeuPirate controlJeuPirate = new ControlJeuPirate(controlLancerDe, boundaryJeuPirate);
        controlJeuPirate.jouer();
        
    }
    
}
