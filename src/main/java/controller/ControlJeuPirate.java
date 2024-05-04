package controller;
import boundary.*;

public class ControlJeuPirate {
    ControlLancerDe controlLancerDe;
    IBoundary iBoundary;

    public ControlJeuPirate(ControlLancerDe controlLancerDe, IBoundary iBoundary) {
        this.controlLancerDe = controlLancerDe;
        this.iBoundary = iBoundary;
    }
    
    public void lancerJeu(){
        //Action...
        //Viens le lancé du dé
        iBoundary.setILancerDe(controlLancerDe);
        int valDes  = iBoundary.lancerDe();
        System.out.println("[ControlJeuPirate] Valeur du de recupere : 1" + String.valueOf(valDes));
        //Action...
    }
    
    public static void main(String[] args) {
        ControlLancerDe controlLancerDe = new ControlLancerDe();
        BoundaryJeuPirate boundaryJeuPirate = new BoundaryJeuPirate();
        
        ControlJeuPirate controlJeuPirate = new ControlJeuPirate(controlLancerDe, boundaryJeuPirate);
        controlJeuPirate.lancerJeu();
        
    }
    
}
